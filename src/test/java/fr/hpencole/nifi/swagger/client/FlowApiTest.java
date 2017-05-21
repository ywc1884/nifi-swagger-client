/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fr.hpencole.nifi.swagger.client;

import fr.hpencole.nifi.swagger.ApiException;
import fr.hpencole.nifi.swagger.client.model.AboutEntity;
import fr.hpencole.nifi.swagger.client.model.ActionEntity;
import fr.hpencole.nifi.swagger.client.model.BannerEntity;
import fr.hpencole.nifi.swagger.client.model.BulletinBoardEntity;
import fr.hpencole.nifi.swagger.client.model.ClusteSummaryEntity;
import fr.hpencole.nifi.swagger.client.model.ClusterSearchResultsEntity;
import fr.hpencole.nifi.swagger.client.model.ComponentHistoryEntity;
import fr.hpencole.nifi.swagger.client.model.ConnectionStatusEntity;
import fr.hpencole.nifi.swagger.client.model.ControllerBulletinsEntity;
import fr.hpencole.nifi.swagger.client.model.ControllerServiceTypesEntity;
import fr.hpencole.nifi.swagger.client.model.ControllerServicesEntity;
import fr.hpencole.nifi.swagger.client.model.ControllerStatusEntity;
import fr.hpencole.nifi.swagger.client.model.CurrentUserEntity;
import fr.hpencole.nifi.swagger.client.model.FlowConfigurationEntity;
import fr.hpencole.nifi.swagger.client.model.HistoryEntity;
import fr.hpencole.nifi.swagger.client.model.PortStatusEntity;
import fr.hpencole.nifi.swagger.client.model.PrioritizerTypesEntity;
import fr.hpencole.nifi.swagger.client.model.ProcessGroupFlowEntity;
import fr.hpencole.nifi.swagger.client.model.ProcessGroupStatusEntity;
import fr.hpencole.nifi.swagger.client.model.ProcessorStatusEntity;
import fr.hpencole.nifi.swagger.client.model.ProcessorTypesEntity;
import fr.hpencole.nifi.swagger.client.model.ReportingTaskTypesEntity;
import fr.hpencole.nifi.swagger.client.model.ReportingTasksEntity;
import fr.hpencole.nifi.swagger.client.model.ScheduleComponentsEntity;
import fr.hpencole.nifi.swagger.client.model.SearchResultsEntity;
import fr.hpencole.nifi.swagger.client.model.StatusHistoryEntity;
import fr.hpencole.nifi.swagger.client.model.TemplatesEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FlowApi
 */
@Ignore
public class FlowApiTest {

    private final FlowApi api = new FlowApi();

    
    /**
     * Generates a client id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateClientIdTest() throws ApiException {
        String response = api.generateClientId();

        // TODO: test validations
    }
    
    /**
     * Retrieves details about this NiFi to put in the About dialog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAboutInfoTest() throws ApiException {
        AboutEntity response = api.getAboutInfo();

        // TODO: test validations
    }
    
    /**
     * Gets an action
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActionTest() throws ApiException {
        String id = null;
        ActionEntity response = api.getAction(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves the banners for this NiFi
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBannersTest() throws ApiException {
        BannerEntity response = api.getBanners();

        // TODO: test validations
    }
    
    /**
     * Gets current bulletins
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBulletinBoardTest() throws ApiException {
        String after = null;
        String sourceName = null;
        String message = null;
        String sourceId = null;
        String groupId = null;
        String limit = null;
        BulletinBoardEntity response = api.getBulletinBoard(after, sourceName, message, sourceId, groupId, limit);

        // TODO: test validations
    }
    
    /**
     * Retrieves Controller level bulletins
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBulletinsTest() throws ApiException {
        ControllerBulletinsEntity response = api.getBulletins();

        // TODO: test validations
    }
    
    /**
     * The cluster summary for this NiFi
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterSummaryTest() throws ApiException {
        ClusteSummaryEntity response = api.getClusterSummary();

        // TODO: test validations
    }
    
    /**
     * Gets configuration history for a component
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getComponentHistoryTest() throws ApiException {
        String componentId = null;
        ComponentHistoryEntity response = api.getComponentHistory(componentId);

        // TODO: test validations
    }
    
    /**
     * Gets status for a connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        ConnectionStatusEntity response = api.getConnectionStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets the status history for a connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionStatusHistoryTest() throws ApiException {
        String id = null;
        StatusHistoryEntity response = api.getConnectionStatusHistory(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves the types of controller services that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServiceTypesTest() throws ApiException {
        String serviceType = null;
        ControllerServiceTypesEntity response = api.getControllerServiceTypes(serviceType);

        // TODO: test validations
    }
    
    /**
     * Gets all controller services
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServicesFromControllerTest() throws ApiException {
        ControllerServicesEntity response = api.getControllerServicesFromController();

        // TODO: test validations
    }
    
    /**
     * Gets all controller services
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerServicesFromGroupTest() throws ApiException {
        String id = null;
        ControllerServicesEntity response = api.getControllerServicesFromGroup(id);

        // TODO: test validations
    }
    
    /**
     * Gets the current status of this NiFi
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getControllerStatusTest() throws ApiException {
        ControllerStatusEntity response = api.getControllerStatus();

        // TODO: test validations
    }
    
    /**
     * Retrieves the user identity of the user making the request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
        CurrentUserEntity response = api.getCurrentUser();

        // TODO: test validations
    }
    
    /**
     * Gets a process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowTest() throws ApiException {
        String id = null;
        ProcessGroupFlowEntity response = api.getFlow(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves the configuration for this NiFi flow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFlowConfigTest() throws ApiException {
        FlowConfigurationEntity response = api.getFlowConfig();

        // TODO: test validations
    }
    
    /**
     * Gets status for an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInputPortStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        PortStatusEntity response = api.getInputPortStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets status for an output port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutputPortStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        PortStatusEntity response = api.getOutputPortStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Retrieves the types of prioritizers that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrioritizersTest() throws ApiException {
        PrioritizerTypesEntity response = api.getPrioritizers();

        // TODO: test validations
    }
    
    /**
     * Gets the status for a process group
     *
     * The status for a process group includes status for all descendent components. When invoked on the root group with recursive set to true, it will return the current status of every component in the flow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupStatusTest() throws ApiException {
        String id = null;
        Boolean recursive = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        ProcessGroupStatusEntity response = api.getProcessGroupStatus(id, recursive, nodewise, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets status history for a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessGroupStatusHistoryTest() throws ApiException {
        String id = null;
        StatusHistoryEntity response = api.getProcessGroupStatusHistory(id);

        // TODO: test validations
    }
    
    /**
     * Gets status for a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        ProcessorStatusEntity response = api.getProcessorStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets status history for a processor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorStatusHistoryTest() throws ApiException {
        String id = null;
        StatusHistoryEntity response = api.getProcessorStatusHistory(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves the types of processors that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessorTypesTest() throws ApiException {
        ProcessorTypesEntity response = api.getProcessorTypes();

        // TODO: test validations
    }
    
    /**
     * Gets status for a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupStatusTest() throws ApiException {
        String id = null;
        Boolean nodewise = null;
        String clusterNodeId = null;
        ProcessorStatusEntity response = api.getRemoteProcessGroupStatus(id, nodewise, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets the status history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupStatusHistoryTest() throws ApiException {
        String id = null;
        StatusHistoryEntity response = api.getRemoteProcessGroupStatusHistory(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves the types of reporting tasks that this NiFi supports
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingTaskTypesTest() throws ApiException {
        ReportingTaskTypesEntity response = api.getReportingTaskTypes();

        // TODO: test validations
    }
    
    /**
     * Gets all reporting tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingTasksTest() throws ApiException {
        ReportingTasksEntity response = api.getReportingTasks();

        // TODO: test validations
    }
    
    /**
     * Gets all templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatesTest() throws ApiException {
        TemplatesEntity response = api.getTemplates();

        // TODO: test validations
    }
    
    /**
     * Gets configuration history
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryHistoryTest() throws ApiException {
        String offset = null;
        String count = null;
        String sortColumn = null;
        String sortOrder = null;
        String startDate = null;
        String endDate = null;
        String userIdentity = null;
        String sourceId = null;
        HistoryEntity response = api.queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId);

        // TODO: test validations
    }
    
    /**
     * Schedule or unschedule comopnents in the specified Process Group.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scheduleComponentsTest() throws ApiException {
        String id = null;
        ScheduleComponentsEntity body = null;
        ScheduleComponentsEntity response = api.scheduleComponents(id, body);

        // TODO: test validations
    }
    
    /**
     * Searches the cluster for a node with the specified address
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchClusterTest() throws ApiException {
        String q = null;
        ClusterSearchResultsEntity response = api.searchCluster(q);

        // TODO: test validations
    }
    
    /**
     * Performs a search against this NiFi using the specified search term
     *
     * Only search results from authorized components will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchFlowTest() throws ApiException {
        String q = null;
        SearchResultsEntity response = api.searchFlow(q);

        // TODO: test validations
    }
    
}
