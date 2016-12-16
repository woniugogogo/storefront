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
package de.hybris.platform.storefront.service.impl;

import de.hybris.platform.storefront.model.BugDAO;
import de.hybris.platform.storefront.model.BugModel;
import de.hybris.platform.storefront.service.BugService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 *
 */
@Component(value = "bugService")
public class DefultBugService implements BugService
{
	@Resource
	private BugDAO bugDAO;

	@Override
	public List<BugModel> getBugs()
	{

		return bugDAO.findBugList();
	}

	@Override
	public BugModel getBugByTitle(final String title)
	{
		return bugDAO.findBugByTitle(title);
	}

	@Override
	public void addBug(final BugModel bugModel)
	{
		bugDAO.addBug(bugModel);
	}

	@Override
	public BugModel editBugByTitle(final String title)
	{
		return bugDAO.findBugByTitle(title);
	}

	@Override
	public void deleteBugByTitle(final String title)
	{
		bugDAO.deleteBugByTitle(title);
	}



}
