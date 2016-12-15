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
}
