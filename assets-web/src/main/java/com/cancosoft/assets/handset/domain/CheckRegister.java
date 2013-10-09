package com.cancosoft.assets.handset.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "queryCache")
@Cacheable(true)
@Entity
@Table(name = "CheckRegister")
public class CheckRegister implements Serializable {
    private static final long serialVersionUID = 1L;

    private int checkRegisterId;
    private String machineNo;
    private Date createDate;
    private String createMan;
    private int version;

    @Column(name = "checkRegisterID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public int getCheckRegisterId() {
        return checkRegisterId;
    }

    public void setCheckRegisterId(int checkRegisterId) {
        this.checkRegisterId = checkRegisterId;
    }

    @Column(name = "machineNo")
    @Basic
    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    @Column(name = "createDate")
    @Basic
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "createMan")
    @Basic
    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    @Column(name = "version")
    @Version
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckRegister that = (CheckRegister) o;

        if (checkRegisterId != that.checkRegisterId) return false;
        if (version != that.version) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createMan != null ? !createMan.equals(that.createMan) : that.createMan != null) return false;
        if (machineNo != null ? !machineNo.equals(that.machineNo) : that.machineNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkRegisterId;
        result = 31 * result + (machineNo != null ? machineNo.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createMan != null ? createMan.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }
}