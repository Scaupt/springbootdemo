/**
 *	create by tools 2019-1-15 17:16:57
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimIdmDeviceStatus.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimIdmDeviceStatus;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_idm_device_status")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimIdmDeviceStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_DEVICESTATUSID = "deviceStatusId";
	public static final String FIELD_DEVICESTATUSNAME = "deviceStatusName";

	@Column(name="device_status_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String deviceStatusId;

	@Column(name="device_status_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String deviceStatusName;

	public String getDeviceStatusId(){

			return this.deviceStatusId;
	}

	public void setDeviceStatusId(String deviceStatusId){
		this.deviceStatusId=deviceStatusId;
	}

	public String getDeviceStatusName(){

			return this.deviceStatusName;
	}

	public void setDeviceStatusName(String deviceStatusName){
		this.deviceStatusName=deviceStatusName;
	}

}
