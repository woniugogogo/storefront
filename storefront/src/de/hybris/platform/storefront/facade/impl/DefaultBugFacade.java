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

import de.hybris.platform.storefront.data.BugCommentData;
import de.hybris.platform.storefront.data.BugData;
import de.hybris.platform.storefront.enums.Serverity;
import de.hybris.platform.storefront.facade.BugFacade;
import de.hybris.platform.storefront.model.BugCommentModel;
import de.hybris.platform.storefront.model.BugModel;
import de.hybris.platform.storefront.service.BugService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

	@Override
	public void addBug(final BugData bugData)
	{
		final BugModel bm = new BugModel();
		bm.setTitle(bugData.getTitle());
		bm.setAssign(bugData.getAssign());
		bm.setSeverity(Serverity.valueOf(bugData.getSeverity()));
		bm.setDesc(bugData.getDesc());
		bugService.addBug(bm);
	}

	@Override
	public void editBugByTitle(final String title, final BugData bugData)
	{
		//find bugModel which u want edit
		final BugModel bm = bugService.getBugByTitle(title);

		//edit
		bm.setTitle(bugData.getTitle());
		bm.setAssign(bugData.getAssign());
		bm.setSeverity(Serverity.valueOf(bugData.getSeverity()));
		bm.setDesc(bugData.getDesc());

		bugService.editBug(bm);
	}

	@Override
	public void deleteBugByTitle(final String title)
	{
		bugService.deleteBugByTitle(title);
	}

	@Override
	public List<BugCommentData> findCommentListByBug(final String bugTitle)
	{
		final List<BugCommentModel> modelList = bugService.findCommentListByBug(bugTitle);
		final List<BugCommentData> dataList = new ArrayList<BugCommentData>();

		for (int i = modelList.size() - 1; i >= 0; i--)
		{
			final BugCommentData data = new BugCommentData();
			data.setCommentContent(modelList.get(i).getCommentContent());
			String dateStr = null;
			final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			dateStr = sdf.format(modelList.get(i).getDate());
			data.setDate(dateStr);
			dataList.add(data);
		}
		return dataList;
	}

	@Override
	public void addCommmentByBugTitle(final String bugTitle, final BugCommentData bugCommentData)
	{
		//指定该评论是属于哪个Bug
		final BugModel bugModel = bugService.getBugByTitle(bugTitle);
		final BugCommentModel bugCommentModel = new BugCommentModel();
		//设置该评论是属于哪个Bug
		bugCommentModel.setBug(bugModel);
		//设置bugComment内容
		bugCommentModel.setCommentContent(bugCommentData.getCommentContent());
		Date date = null;
		try
		{
			final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			date = sdf.parse(bugCommentData.getDate());
		}
		catch (final ParseException e)
		{
			System.out.println(e.getMessage());

		}
		bugCommentModel.setDate(date);
		bugService.addCommmentByBugTitle(bugCommentModel);
	}


}
