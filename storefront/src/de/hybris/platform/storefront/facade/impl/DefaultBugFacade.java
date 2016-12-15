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
package de.hybris.platform.storefront.facade.impl;

import de.hybris.platform.storefront.data.BugData;
import de.hybris.platform.storefront.facade.BugFacade;
import de.hybris.platform.storefront.model.BugModel;
import de.hybris.platform.storefront.service.BugService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 *
 */
@Component(value = "bugFacade")
public class DefaultBugFacade implements BugFacade
{
	@Resource
	private BugService bugService;

	@Override
	public BugData getBugByTitle(final String title)
	{
		final BugData bugData = new BugData();
		BugModel bugModel = null;
		if (title != null)
		{
			bugModel = bugService.getBugByTitle(title);
			if (bugModel == null)
			{
				return null;
			}
			bugData.setTitle(bugModel.getTitle());
			bugData.setSeverity(bugModel.getSeverity().toString());
			bugData.setAssign(bugModel.getAssign());
			bugData.setDesc(bugModel.getDesc());
		}
		else
		{
			throw new IllegalArgumentException("Stadium with name " + title + " not found.");
		}

		return bugData;
	}

	@Override
	public List<BugData> getBugs()
	{
		final List<BugModel> bugModels = bugService.getBugs();
		final List<BugData> bugDatas = new ArrayList<BugData>();
		for (final BugModel bm : bugModels)
		{
			final BugData bd = new BugData();
			bd.setTitle(bm.getTitle());
			bd.setSeverity(bm.getSeverity().toString());
			bd.setAssign(bm.getAssign());
			bd.setDesc(bm.getDesc());
			bugDatas.add(bd);
		}

		return bugDatas;
	}

}
