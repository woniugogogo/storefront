/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2016 6:21:01 PM                     ---
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
import de.hybris.platform.storefront.constants.StorefrontConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BugModel}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBugModel extends GenericItem
{
	/** Qualifier of the <code>BugModel.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>BugModel.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>BugModel.severity</code> attribute **/
	public static final String SEVERITY = "severity";
	/** Qualifier of the <code>BugModel.desc</code> attribute **/
	public static final String DESC = "desc";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(SEVERITY, AttributeMode.INITIAL);
		tmp.put(DESC, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.desc</code> attribute.
	 * @return the desc - Description
	 */
	public String getDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.desc</code> attribute.
	 * @return the desc - Description
	 */
	public String getDesc()
	{
		return getDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.desc</code> attribute. 
	 * @param value the desc - Description
	 */
	public void setDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.desc</code> attribute. 
	 * @param value the desc - Description
	 */
	public void setDesc(final String value)
	{
		setDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.severity</code> attribute.
	 * @return the severity - Severity
	 */
	public String getSeverity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEVERITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.severity</code> attribute.
	 * @return the severity - Severity
	 */
	public String getSeverity()
	{
		return getSeverity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.severity</code> attribute. 
	 * @param value the severity - Severity
	 */
	public void setSeverity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEVERITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.severity</code> attribute. 
	 * @param value the severity - Severity
	 */
	public void setSeverity(final String value)
	{
		setSeverity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.title</code> attribute.
	 * @return the title - Title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugModel.title</code> attribute.
	 * @return the title - Title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.title</code> attribute. 
	 * @param value the title - Title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugModel.title</code> attribute. 
	 * @param value the title - Title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
