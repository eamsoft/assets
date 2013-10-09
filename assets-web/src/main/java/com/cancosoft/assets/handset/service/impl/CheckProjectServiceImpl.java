package com.cancosoft.assets.handset.service.impl;

import com.cancosoft.assets.handset.repository.CheckRegisterRepository;
import com.cancosoft.assets.handset.service.CheckProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@Service("CheckProjectService")
@WebService(serviceName = "CheckProjectService", endpointInterface = "com.cancosoft.assets.handset.service.CheckProjectService")
@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING)
public class CheckProjectServiceImpl implements CheckProjectService {
    @Autowired
    private CheckRegisterRepository checkRegisterRepository;

//    @Autowired
//    private VCheckProjectMapper vCheckProjectMapper;
//
//    @Autowired
//    private VCheckOrganMapper vCheckOrganMapper;
//
//    @Autowired
//    private VCheckUnitMapper vCheckUnitMapper;
//
//    @Autowired
//    private VCheckEmployeeMapper vCheckEmployeeMapper;
//
//    @Autowired
//    private VCheckDepositaryMapper vCheckDepositaryMapper;

    @Override
    public String isRegister(String machineCode) throws Exception {

//        javax.persistence.Query.setHint(”org.hibernate.cacheable”, true);

        int findNum = checkRegisterRepository.findByMachineNo(machineCode).size();
        return (findNum > 0) ? "1" : "0";
    }

//    @Override
//    public List<TaskPlan> getTaskPlan(String queryName) throws Exception {
//        return vCheckProjectMapper.findAll();
//    }
//
//    @Override
//    public List<CompanyInfo> getCompanyInfo(Integer projectId) throws Exception {
//        return vCheckOrganMapper.findByProjectId(projectId);
//    }
//
//    @Override
//    public List<DeptInfo> getDeptInfo(Integer projectId) throws Exception {
//        return vCheckUnitMapper.findByProjectId(projectId);
//    }
//
//    @Override
//    public List<UserInfo> getUserInfo(Integer projectId) throws Exception {
//        return vCheckEmployeeMapper.findByProjectId(projectId);
//    }
//
//    @Override
//    public List<DepoInfo> getDepoInfo(Integer projectId) throws Exception {
//        return vCheckDepositaryMapper.findByProjectId(projectId);
//    }
}