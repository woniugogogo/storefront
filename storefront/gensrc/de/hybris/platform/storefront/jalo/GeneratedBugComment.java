/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 15, 2016 2:51:44 PM                     ---
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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.storefront.constants.StorefrontConstants;
import de.hybris.platform.storefront.jalo.Bug;
import de.hybris.platform.storefront.jalo.BugUser;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BugComment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBugComment extends GenericItem
{
	/** Qualifier of the <code>BugComment.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>BugComment.commentContent</code> attribute **/
	public static final String COMMENTCONTENT = "commentContent";
	/** Qualifier of the <code>BugComment.bug</code> attribute **/
	public static final String BUG = "bug";
	/** Qualifier of the <code>BugComment.bugUser</code> attribute **/
	public static final String BUGUSER = "bugUser";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBugComment> BUGHANDLER = new BidirectionalOneToManyHandler<GeneratedBugComment>(
	StorefrontConstants.TC.BUGCOMMENT,
	false,
	"bug",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUGUSER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBugComment> BUGUSERHANDLER = new BidirectionalOneToManyHandler<GeneratedBugComment>(
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
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(COMMENTCONTENT, AttributeMode.INITIAL);
		tmp.put(BUG, AttributeMode.INITIAL);
		tmp.put(BUGUSER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.bug</code> attribute.
	 * @return the bug
	 */
	public Bug getBug(final SessionContext ctx)
	{
		return (Bug)getProperty( ctx, BUG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.bug</code> attribute.
	 * @return the bug
	 */
	public Bug getBug()
	{
		return getBug( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.bug</code> attribute. 
	 * @param value the bug
	 */
	public void setBug(final SessionContext ctx, final Bug value)
	{
		BUGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.bug</code> attribute. 
	 * @param value the bug
	 */
	public void setBug(final Bug value)
	{
		setBug( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.bugUser</code> attribute.
	 * @return the bugUser
	 */
	public BugUser getBugUser(final SessionContext ctx)
	{
		return (BugUser)getProperty( ctx, BUGUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.bugUser</code> attribute.
	 * @return the bugUser
	 */
	public BugUser getBugUser()
	{
		return getBugUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.bugUser</code> attribute. 
	 * @param value the bugUser
	 */
	public void setBugUser(final SessionContext ctx, final BugUser value)
	{
		BUGUSERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.bugUser</code> attribute. 
	 * @param value the bugUser
	 */
	public void setBugUser(final BugUser value)
	{
		setBugUser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.commentContent</code> attribute.
	 * @return the commentContent - Comment Content
	 */
	public String getCommentContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENTCONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.commentContent</code> attribute.
	 * @return the commentContent - Comment Content
	 */
	public String getCommentContent()
	{
		return getCommentContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.commentContent</code> attribute. 
	 * @param value the commentContent - Comment Content
	 */
	public void setCommentContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENTCONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.commentContent</code> attribute. 
	 * @param value the commentContent - Comment Content
	 */
	public void setCommentContent(final String value)
	{
		setCommentContent( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUGHANDLER.newInstance(ctx, allAttributes);
		BUGUSERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
}
