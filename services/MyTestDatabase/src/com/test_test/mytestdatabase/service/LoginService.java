/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.test_test.mytestdatabase.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.test_test.mytestdatabase.*;

/**
 * Service object for domain model class Login.
 * @see com.test_test.mytestdatabase.Login
 */

public interface LoginService {
   /**
	 * Creates a new login.
	 * 
	 * @param created
	 *            The information of the created login.
	 * @return The created login.
	 */
	public Login create(Login created);

	/**
	 * Deletes a login.
	 * 
	 * @param loginId
	 *            The id of the deleted login.
	 * @return The deleted login.
	 * @throws EntityNotFoundException
	 *             if no login is found with the given id.
	 */
	public Login delete(Integer loginId) throws EntityNotFoundException;

	/**
	 * Finds all logins.
	 * 
	 * @return A list of logins.
	 */
	public Page<Login> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Login> findAll(Pageable pageable);
	
	/**
	 * Finds login by id.
	 * 
	 * @param id
	 *            The id of the wanted login.
	 * @return The found login. If no login is found, this method returns
	 *         null.
	 */
	public Login findById(Integer id) throws EntityNotFoundException;
	/**
	 * Updates the information of a login.
	 * 
	 * @param updated
	 *            The information of the updated login.
	 * @return The updated login.
	 * @throws EntityNotFoundException
	 *             if no login is found with given id.
	 */
	public Login update(Login updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the logins in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the login.
	 */

	public long countAll();


    public Page<Login> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}
