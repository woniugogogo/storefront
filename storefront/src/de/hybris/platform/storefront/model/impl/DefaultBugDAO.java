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
package de.hybris.platform.storefront.model.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.storefront.model.BugDAO;
import de.hybris.platform.storefront.model.BugModel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 */
@Component(value = "bugDAO")
public class DefaultBugDAO implements BugDAO
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Resource
	private ModelService modelService;

	@Override
	public List<BugModel> findBugList()
	{
		final String queryString = "SELECT {p:" + BugModel.PK + "} " + "FROM {" + BugModel._TYPECODE + " AS p} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		final List<BugModel> lists = flexibleSearchService.<BugModel> search(query).getResult();

		return lists;
	}

	@Override
	public BugModel findBugByTitle(final String title)
	{
		final String queryString = "SELECT {p:" + BugModel.PK + "}" + "FROM {" + BugModel._TYPECODE + " AS p} " + "WHERE " + "{p:"
				+ BugModel.TITLE + "}=?title ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("title", title);

		return flexibleSearchService.<BugModel> search(query).getResult().get(0);
	}

	@Override
	public void addBug(final BugModel bugModel)
	{
		modelService.save(bugModel);

	}

	@Override
	public void editBug(final BugModel bugModel)
	{
		System.out.println("Dao: ... desc:" + bugModel.getDesc());
		modelService.save(bugModel);
	}

	@Override
	public void deleteBugByTitle(final String title)
	{
		final BugModel bugModel = findBugByTitle(title);
		modelService.remove(bugModel);
	}



}
