/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 20, 2016 5:17:51 PM                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.storefront.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.storefront.constants.StorefrontConstants;
import de.hybris.platform.storefront.jalo.BugComment;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BugUser}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBugUser extends GenericItem
{
	/** Qualifier of the <code>BugUser.bugUserId</code> attribute **/
	public static final String BUGUSERID = "bugUserId";
	/** Qualifier of the <code>BugUser.bugUserName</code> attribute **/
	public static final String BUGUSERNAME = "bugUserName";
	/** Qualifier of the <code>BugUser.bugComments</code> attribute **/
	public static final String BUGCOMMENTS = "bugComments";
	/**
	* {@link OneToManyHandler} for handling 1:n BUGCOMMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BugComment> BUGCOMMENTSHANDLER = new OneToManyHandler<BugComment>(
	StorefrontConstants.TC.BUGCOMMENT,
	false,
	"bugUser",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUGUSERID, AttributeMode.INITIAL);
		tmp.put(BUGUSERNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugComments</code> attribute.
	 * @return the bugComments
	 */
	public Collection<BugComment> getBugComments(final SessionContext ctx)
	{
		return BUGCOMMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugComments</code> attribute.
	 * @return the bugComments
	 */
	public Collection<BugComment> getBugComments()
	{
		return getBugComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugComments</code> attribute. 
	 * @param value the bugComments
	 */
	public void setBugComments(final SessionContext ctx, final Collection<BugComment> value)
	{
		BUGCOMMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugComments</code> attribute. 
	 * @param value the bugComments
	 */
	public void setBugComments(final Collection<BugComment> value)
	{
		setBugComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bugComments. 
	 * @param value the item to add to bugComments
	 */
	public void addToBugComments(final SessionContext ctx, final BugComment value)
	{
		BUGCOMMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bugComments. 
	 * @param value the item to add to bugComments
	 */
	public void addToBugComments(final BugComment value)
	{
		addToBugComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bugComments. 
	 * @param value the item to remove from bugComments
	 */
	public void removeFromBugComments(final SessionContext ctx, final BugComment value)
	{
		BUGCOMMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bugComments. 
	 * @param value the item to remove from bugComments
	 */
	public void removeFromBugComments(final BugComment value)
	{
		removeFromBugComments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugUserId</code> attribute.
	 * @return the bugUserId - BugUserId
	 */
	public Integer getBugUserId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BUGUSERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugUserId</code> attribute.
	 * @return the bugUserId - BugUserId
	 */
	public Integer getBugUserId()
	{
		return getBugUserId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugUserId</code> attribute. 
	 * @return the bugUserId - BugUserId
	 */
	public int getBugUserIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBugUserId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugUserId</code> attribute. 
	 * @return the bugUserId - BugUserId
	 */
	public int getBugUserIdAsPrimitive()
	{
		return getBugUserIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugUserId</code> attribute. 
	 * @param value the bugUserId - BugUserId
	 */
	public void setBugUserId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BUGUSERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugUserId</code> attribute. 
	 * @param value the bugUserId - BugUserId
	 */
	public void setBugUserId(final Integer value)
	{
		setBugUserId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugUserId</code> attribute. 
	 * @param value the bugUserId - BugUserId
	 */
	public void setBugUserId(final SessionContext ctx, final int value)
	{
		setBugUserId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugUserId</code> attribute. 
	 * @param value the bugUserId - BugUserId
	 */
	public void setBugUserId(final int value)
	{
		setBugUserId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugUserName</code> attribute.
	 * @return the bugUserName - BugUserName
	 */
	public String getBugUserName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUGUSERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugUser.bugUserName</code> attribute.
	 * @return the bugUserName - BugUserName
	 */
	public String getBugUserName()
	{
		return getBugUserName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugUserName</code> attribute. 
	 * @param value the bugUserName - BugUserName
	 */
	public void setBugUserName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUGUSERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugUser.bugUserName</code> attribute. 
	 * @param value the bugUserName - BugUserName
	 */
	public void setBugUserName(final String value)
	{
		setBugUserName( getSession().getSessionContext(), value );
	}
	
}
