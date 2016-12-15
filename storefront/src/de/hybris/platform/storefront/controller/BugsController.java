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

import de.hybris.platform.storefront.data.BugData;
import de.hybris.platform.storefront.facade.BugFacade;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 */
@Controller
public class BugsController
{

	private BugFacade bugFacade;

	@RequestMapping(value = "/bugs")
	public String showBugs(final Model model)
	{
		final List<BugData> bugs = bugFacade.getBugs();
		System.out.println("----" + bugFacade.getBugs().size());
		for (int i = 0; i < bugs.size(); i++)
		{
			System.out.println("Title:" + bugs.get(i).getTitle() + "Assign:" + bugs.get(i).getAssign() + "Severity:"
					+ bugs.get(i).getSeverity() + "Desc:" + bugs.get(i).getDesc());
		}
		model.addAttribute("bugs", bugs);
		return "bugList";
	}

	@Resource
	public void setBugFacade(final BugFacade bugFacade)
	{
		this.bugFacade = bugFacade;
	}



}
