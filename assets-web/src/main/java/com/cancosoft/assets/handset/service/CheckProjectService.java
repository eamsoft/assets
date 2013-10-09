package com.cancosoft.assets.handset.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.webservice.canco.com")
public interface CheckProjectService {
    /**
     * 通过设备序列号查看是否注册
     *
     * @param machineCode 设备序列号
     * @return String -1设备序列号为空,0未注册,1已注册
     * @throws Exception
     */
    @WebMethod(action = "urn:isRegister", operationName = "isRegister")
    @WebResult(targetNamespace = "http://service.webservice.canco.com")
    String isRegister(@WebParam(name = "machineCode", targetNamespace = "http://service.webservice.canco.com") String machineCode) throws Exception;

//    /**
//     * 盘点认为信息列表
//     *
//     * @param queryName 查询字符串
//     * @return TaskPlan[]
//     * @throws Exception
//     */
//    @WebMethod
//    List<TaskPlan> getTaskPlan(@WebParam(name = "queryName") String queryName) throws Exception;
//
//    /**
//     * 单位信息列表
//     *
//     * @param projectId 盘点任务id
//     * @return CompanyInfo[]
//     * @throws Exception
//     */
//    @WebMethod
//    List<CompanyInfo> getCompanyInfo(@WebParam(name = "projectId") Integer projectId) throws Exception;
//
//    /**
//     * 部门信息列表
//     *
//     * @param projectId 盘点任务代码
//     * @return DeptInfo[]
//     * @throws Exception
//     */
//    @WebMethod
//    List<DeptInfo> getDeptInfo(@WebParam(name = "projectId") Integer projectId) throws Exception;
//
//    /**
//     * 员工信息列表
//     *
//     * @param projectId 盘点任务代码
//     * @return UserInfo[]
//     * @throws Exception
//     */
//    @WebMethod
//    List<UserInfo> getUserInfo(@WebParam(name = "projectId") Integer projectId) throws Exception;
//
//    /**
//     * 存放地信息列表
//     *
//     * @param projectId 盘点任务代码
//     * @return DepoInfo[]
//     * @throws Exception
//     */
//    @WebMethod
//    List<DepoInfo> getDepoInfo(@WebParam(name = "projectId") Integer projectId) throws Exception;
}