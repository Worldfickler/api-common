package org.fickler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.fickler.model.entity.InterfaceInfo;
import org.fickler.model.entity.User;
import org.fickler.model.entity.UserInterfaceInfo;

/**
* @author dell
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-09-02 00:11:08
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 数据库中是否已分配用户密钥（accessKey secretKey）
     * @param accessKey
     * @param secretKey
     * @return
     */
    User getInvokeUser(String accessKey, String secretKey);

    /**
     * 从数据库中检查接口是否存在（请求路径 请求方法 请求参数）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
