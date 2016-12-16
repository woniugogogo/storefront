package de.hybris.platform.storefront.facade;

import de.hybris.platform.storefront.data.BugData;

import java.util.List;


/**
 *
 */
public interface BugFacade
{
	public BugData getBugByTitle(String title);

	public List<BugData> getBugs();

	public void addBug(BugData bugData);

	public void editBugByTitle(String title, BugData bugData);

	public void deleteBugByTitle(String title);
}
