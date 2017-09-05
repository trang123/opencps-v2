/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.backend.dossiermgt.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DossierLog. This utility wraps
 * {@link org.opencps.backend.dossiermgt.service.impl.DossierLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see DossierLogLocalService
 * @see org.opencps.backend.dossiermgt.service.base.DossierLogLocalServiceBaseImpl
 * @see org.opencps.backend.dossiermgt.service.impl.DossierLogLocalServiceImpl
 * @generated
 */
@ProviderType
public class DossierLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.backend.dossiermgt.service.impl.DossierLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of dossier logs.
	*
	* @return the number of dossier logs
	*/
	public static int getDossierLogsCount() {
		return getService().getDossierLogsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.backend.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.backend.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the dossier logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.backend.dossiermgt.model.impl.DossierLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @return the range of dossier logs
	*/
	public static java.util.List<org.opencps.backend.dossiermgt.model.DossierLog> getDossierLogs(
		int start, int end) {
		return getService().getDossierLogs(start, end);
	}

	/**
	* Returns all the dossier logs matching the UUID and company.
	*
	* @param uuid the UUID of the dossier logs
	* @param companyId the primary key of the company
	* @return the matching dossier logs, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.backend.dossiermgt.model.DossierLog> getDossierLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDossierLogsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of dossier logs matching the UUID and company.
	*
	* @param uuid the UUID of the dossier logs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dossier logs
	* @param end the upper bound of the range of dossier logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dossier logs, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.backend.dossiermgt.model.DossierLog> getDossierLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.backend.dossiermgt.model.DossierLog> orderByComparator) {
		return getService()
				   .getDossierLogsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the dossier log to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was added
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog addDossierLog(
		org.opencps.backend.dossiermgt.model.DossierLog dossierLog) {
		return getService().addDossierLog(dossierLog);
	}

	/**
	* Creates a new dossier log with the primary key. Does not add the dossier log to the database.
	*
	* @param dossierLogId the primary key for the new dossier log
	* @return the new dossier log
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog createDossierLog(
		long dossierLogId) {
		return getService().createDossierLog(dossierLogId);
	}

	/**
	* Deletes the dossier log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log that was removed
	* @throws PortalException if a dossier log with the primary key could not be found
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog deleteDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDossierLog(dossierLogId);
	}

	/**
	* Deletes the dossier log from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was removed
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog deleteDossierLog(
		org.opencps.backend.dossiermgt.model.DossierLog dossierLog) {
		return getService().deleteDossierLog(dossierLog);
	}

	public static org.opencps.backend.dossiermgt.model.DossierLog fetchDossierLog(
		long dossierLogId) {
		return getService().fetchDossierLog(dossierLogId);
	}

	/**
	* Returns the dossier log matching the UUID and group.
	*
	* @param uuid the dossier log's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier log, or <code>null</code> if a matching dossier log could not be found
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog fetchDossierLogByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDossierLogByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the dossier log with the primary key.
	*
	* @param dossierLogId the primary key of the dossier log
	* @return the dossier log
	* @throws PortalException if a dossier log with the primary key could not be found
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog getDossierLog(
		long dossierLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierLog(dossierLogId);
	}

	/**
	* Returns the dossier log matching the UUID and group.
	*
	* @param uuid the dossier log's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier log
	* @throws PortalException if a matching dossier log could not be found
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog getDossierLogByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierLogByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the dossier log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierLog the dossier log
	* @return the dossier log that was updated
	*/
	public static org.opencps.backend.dossiermgt.model.DossierLog updateDossierLog(
		org.opencps.backend.dossiermgt.model.DossierLog dossierLog) {
		return getService().updateDossierLog(dossierLog);
	}

	public static DossierLogLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DossierLogLocalService, DossierLogLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DossierLogLocalService.class);
}