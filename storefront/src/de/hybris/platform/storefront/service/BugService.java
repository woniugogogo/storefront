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
package de.hybris.platform.storefront.service;

import de.hybris.platform.storefront.model.BugModel;

import java.util.List;


/**
 *
 */
public interface BugService
{
	public List<BugModel> getBugs();

	public BugModel getBugByTitle(String title);

	public void addBug(BugModel bugModel);

	public BugModel editBugByTitle(String title);

	public void deleteBugByTitle(String title);
}
