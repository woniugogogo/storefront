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
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.storefront.constants.StorefrontConstants;
import de.hybris.platform.storefront.jalo.BugComment;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Bug}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBug extends GenericItem
{
	/** Qualifier of the <code>Bug.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Bug.severity</code> attribute **/
	public static final String SEVERITY = "severity";
	/** Qualifier of the <code>Bug.assign</code> attribute **/
	public static final String ASSIGN = "assign";
	/** Qualifier of the <code>Bug.desc</code> attribute **/
	public static final String DESC = "desc";
	/** Qualifier of the <code>Bug.bugComments</code> attribute **/
	public static final String BUGCOMMENTS = "bugComments";
	/**
	* {@link OneToManyHandler} for handling 1:n BUGCOMMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BugComment> BUGCOMMENTSHANDLER = new OneToManyHandler<BugComment>(
	StorefrontConstants.TC.BUGCOMMENT,
	false,
	"bug",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(SEVERITY, AttributeMode.INITIAL);
		tmp.put(ASSIGN, AttributeMode.INITIAL);
		tmp.put(DESC, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.assign</code> attribute.
	 * @return the assign - Bug Assign to
	 */
	public String getAssign(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ASSIGN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.assign</code> attribute.
	 * @return the assign - Bug Assign to
	 */
	public String getAssign()
	{
		return getAssign( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.assign</code> attribute. 
	 * @param value the assign - Bug Assign to
	 */
	public void setAssign(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ASSIGN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.assign</code> attribute. 
	 * @param value the assign - Bug Assign to
	 */
	public void setAssign(final String value)
	{
		setAssign( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.bugComments</code> attribute.
	 * @return the bugComments
	 */
	public Collection<BugComment> getBugComments(final SessionContext ctx)
	{
		return BUGCOMMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.bugComments</code> attribute.
	 * @return the bugComments
	 */
	public Collection<BugComment> getBugComments()
	{
		return getBugComments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.bugComments</code> attribute. 
	 * @param value the bugComments
	 */
	public void setBugComments(final SessionContext ctx, final Collection<BugComment> value)
	{
		BUGCOMMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.bugComments</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Bug.desc</code> attribute.
	 * @return the desc - Description
	 */
	public String getDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.desc</code> attribute.
	 * @return the desc - Description
	 */
	public String getDesc()
	{
		return getDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.desc</code> attribute. 
	 * @param value the desc - Description
	 */
	public void setDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.desc</code> attribute. 
	 * @param value the desc - Description
	 */
	public void setDesc(final String value)
	{
		setDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.severity</code> attribute.
	 * @return the severity
	 */
	public EnumerationValue getSeverity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEVERITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.severity</code> attribute.
	 * @return the severity
	 */
	public EnumerationValue getSeverity()
	{
		return getSeverity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.severity</code> attribute. 
	 * @param value the severity
	 */
	public void setSeverity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEVERITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.severity</code> attribute. 
	 * @param value the severity
	 */
	public void setSeverity(final EnumerationValue value)
	{
		setSeverity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.title</code> attribute.
	 * @return the title - Title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.title</code> attribute.
	 * @return the title - Title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.title</code> attribute. 
	 * @param value the title - Title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.title</code> attribute. 
	 * @param value the title - Title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
