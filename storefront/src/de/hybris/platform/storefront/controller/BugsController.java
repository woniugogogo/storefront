/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.storefront.controller;

import de.hybris.platform.storefront.data.BugCommentData;
import de.hybris.platform.storefront.data.BugData;
import de.hybris.platform.storefront.facade.BugFacade;

import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sap.security.core.server.csi.util.URLDecoder;


/**
 *
 */
@Controller
public class BugsController
{

	@Resource
	private BugFacade bugFacade;

	@RequestMapping(value = "/bugs", method = RequestMethod.GET)
	public String showBugs(final Model model)
	{
		final List<BugData> bugs = bugFacade.getBugs();
		model.addAttribute("bugs", bugs);
		return "bugList";
	}


	@RequestMapping(value = "/bugs/show/{bugTitle}", method = RequestMethod.GET)
	public String showBugDetails(@PathVariable final String bugTitle, final Model model)
	{
		final String title = URLDecoder.decode(bugTitle);
		final BugData bugData = bugFacade.getBugByTitle(title);
		final List<BugCommentData> commentList = bugFacade.findCommentListByBug(title);
		model.addAttribute("bugData", bugData);
		model.addAttribute("commentList", commentList);
		return "viewBug";
	}

	@RequestMapping(value = "/bugs/{bugTitle}/addComment", method = RequestMethod.POST)
	public String addCommentByBugTitle(@PathVariable final String bugTitle, final BugCommentData bugCommentData)
	{
		final String title = URLDecoder.decode(bugTitle);
		if (bugCommentData != null)
		{
			bugFacade.addCommmentByBugTitle(title, bugCommentData);
		}

		return "redirect:/bugs/show/" + URLEncoder.encode(bugTitle);
	}

	@RequestMapping(value = "/bugs/edit/{bugTitle}", method = RequestMethod.GET)
	public String editBug(@PathVariable final String bugTitle, final Model model)
	{
		final BugData bugData = bugFacade.getBugByTitle(bugTitle);
		model.addAttribute("bugData", bugData);
		return "editBug";
	}

	@RequestMapping(value = "/bugs/submitEditBug", method = RequestMethod.POST)
	public String submitEditBug(final BugData bugData)
	{
		bugFacade.editBugByTitle(bugData.getTitle(), bugData);
		return "redirect:/bugs";
	}

	@RequestMapping(value = "/bugs/add", method = RequestMethod.GET)
	public String addBug()
	{
		return "addBug";
	}

	@RequestMapping(value = "/bugs/submitAddBug", method = RequestMethod.POST)
	public String submitAddBug(final BugData bugData)
	{
		bugFacade.addBug(bugData);
		return "redirect:/bugs";
	}

	@RequestMapping(value = "/bugs/delete/{bugTitle}", method = RequestMethod.GET)
	public String deleteBug(@PathVariable final String bugTitle)
	{
		bugFacade.deleteBugByTitle(bugTitle);
		return "redirect:/bugs";
	}

}
