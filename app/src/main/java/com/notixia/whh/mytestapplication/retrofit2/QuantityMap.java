package com.notixia.whh.mytestapplication.retrofit2;

import com.squareup.moshi.Json;

public class QuantityMap {

    @Json(name = "operationPCLinkID")
    private String operationPCLinkID;
    @Json(name = "USER_SCRAP_QTY")
    private Integer uSERSCRAPQTY;
    @Json(name = "PENDING_QTY")
    private Integer pENDINGQTY;
    @Json(name = "TOTAL_QTY_IN_INVENTORY")
    private Integer tOTALQTYININVENTORY;
    @Json(name = "WAREHOUSE_ITEM_NAME")
    private String wAREHOUSEITEMNAME;
    @Json(name = "PERMISSION_ADD_IN_INVENTORY")
    private Boolean pERMISSIONADDININVENTORY;
    @Json(name = "JobOrderID")
    private String jobOrderID;
    @Json(name = "operationPCLinkIDName")
    private String operationPCLinkIDName;
    @Json(name = "REMAINING_QTY")
    private Integer rEMAININGQTY;
    @Json(name = "ALLOWED_SCRAP_QTY")
    private Integer aLLOWEDSCRAPQTY;
    @Json(name = "IS_NESTING")
    private Boolean iSNESTING;
    @Json(name = "PREVIOUS_GOOD_QTY")
    private Integer pREVIOUSGOODQTY;
    @Json(name = "INIT_QTY")
    private Integer iNITQTY;
    @Json(name = "WAREHOUSE_ITEM_MANAGED_IN_BATCH")
    private Boolean wAREHOUSEITEMMANAGEDINBATCH;
    @Json(name = "TOTAL_QTY_ALREADY_IN_INVENTORY")
    private Integer tOTALQTYALREADYININVENTORY;
    @Json(name = "BATCHS")
    private String bATCHS;
    @Json(name = "JobOrderName")
    private String jobOrderName;
    @Json(name = "REAL_QTY_MADE_BY_TABLET")
    private Integer rEALQTYMADEBYTABLET;
    @Json(name = "REQUIRED_QTY")
    private Integer rEQUIREDQTY;
    @Json(name = "USER_GOOD_QTY")
    private Integer uSERGOODQTY;
    @Json(name = "CURRENT_GOOD_QTY")
    private Integer cURRENTGOODQTY;
    @Json(name = "CURRENT_SCRAP_QTY")
    private Integer cURRENTSCRAPQTY;
    @Json(name = "INIT_REQUIRED_QTY")
    private Integer iNITREQUIREDQTY;
    @Json(name = "PREVIOUS_SCRAP_QTY")
    private Integer pREVIOUSSCRAPQTY;
    @Json(name = "IS_SERIALISATION")
    private Boolean iSSERIALISATION;

    public String getOperationPCLinkID() {
        return operationPCLinkID;
    }

    public void setOperationPCLinkID(String operationPCLinkID) {
        this.operationPCLinkID = operationPCLinkID;
    }

    public Integer getUSERSCRAPQTY() {
        return uSERSCRAPQTY;
    }

    public void setUSERSCRAPQTY(Integer uSERSCRAPQTY) {
        this.uSERSCRAPQTY = uSERSCRAPQTY;
    }

    public Integer getPENDINGQTY() {
        return pENDINGQTY;
    }

    public void setPENDINGQTY(Integer pENDINGQTY) {
        this.pENDINGQTY = pENDINGQTY;
    }

    public Integer getTOTALQTYININVENTORY() {
        return tOTALQTYININVENTORY;
    }

    public void setTOTALQTYININVENTORY(Integer tOTALQTYININVENTORY) {
        this.tOTALQTYININVENTORY = tOTALQTYININVENTORY;
    }

    public String getWAREHOUSEITEMNAME() {
        return wAREHOUSEITEMNAME;
    }

    public void setWAREHOUSEITEMNAME(String wAREHOUSEITEMNAME) {
        this.wAREHOUSEITEMNAME = wAREHOUSEITEMNAME;
    }

    public Boolean getPERMISSIONADDININVENTORY() {
        return pERMISSIONADDININVENTORY;
    }

    public void setPERMISSIONADDININVENTORY(Boolean pERMISSIONADDININVENTORY) {
        this.pERMISSIONADDININVENTORY = pERMISSIONADDININVENTORY;
    }

    public String getJobOrderID() {
        return jobOrderID;
    }

    public void setJobOrderID(String jobOrderID) {
        this.jobOrderID = jobOrderID;
    }

    public String getOperationPCLinkIDName() {
        return operationPCLinkIDName;
    }

    public void setOperationPCLinkIDName(String operationPCLinkIDName) {
        this.operationPCLinkIDName = operationPCLinkIDName;
    }

    public Integer getREMAININGQTY() {
        return rEMAININGQTY;
    }

    public void setREMAININGQTY(Integer rEMAININGQTY) {
        this.rEMAININGQTY = rEMAININGQTY;
    }

    public Integer getALLOWEDSCRAPQTY() {
        return aLLOWEDSCRAPQTY;
    }

    public void setALLOWEDSCRAPQTY(Integer aLLOWEDSCRAPQTY) {
        this.aLLOWEDSCRAPQTY = aLLOWEDSCRAPQTY;
    }

    public Boolean getISNESTING() {
        return iSNESTING;
    }

    public void setISNESTING(Boolean iSNESTING) {
        this.iSNESTING = iSNESTING;
    }

    public Integer getPREVIOUSGOODQTY() {
        return pREVIOUSGOODQTY;
    }

    public void setPREVIOUSGOODQTY(Integer pREVIOUSGOODQTY) {
        this.pREVIOUSGOODQTY = pREVIOUSGOODQTY;
    }

    public Integer getINITQTY() {
        return iNITQTY;
    }

    public void setINITQTY(Integer iNITQTY) {
        this.iNITQTY = iNITQTY;
    }

    public Boolean getWAREHOUSEITEMMANAGEDINBATCH() {
        return wAREHOUSEITEMMANAGEDINBATCH;
    }

    public void setWAREHOUSEITEMMANAGEDINBATCH(Boolean wAREHOUSEITEMMANAGEDINBATCH) {
        this.wAREHOUSEITEMMANAGEDINBATCH = wAREHOUSEITEMMANAGEDINBATCH;
    }

    public Integer getTOTALQTYALREADYININVENTORY() {
        return tOTALQTYALREADYININVENTORY;
    }

    public void setTOTALQTYALREADYININVENTORY(Integer tOTALQTYALREADYININVENTORY) {
        this.tOTALQTYALREADYININVENTORY = tOTALQTYALREADYININVENTORY;
    }

    public String getBATCHS() {
        return bATCHS;
    }

    public void setBATCHS(String bATCHS) {
        this.bATCHS = bATCHS;
    }

    public String getJobOrderName() {
        return jobOrderName;
    }

    public void setJobOrderName(String jobOrderName) {
        this.jobOrderName = jobOrderName;
    }

    public Integer getREALQTYMADEBYTABLET() {
        return rEALQTYMADEBYTABLET;
    }

    public void setREALQTYMADEBYTABLET(Integer rEALQTYMADEBYTABLET) {
        this.rEALQTYMADEBYTABLET = rEALQTYMADEBYTABLET;
    }

    public Integer getREQUIREDQTY() {
        return rEQUIREDQTY;
    }

    public void setREQUIREDQTY(Integer rEQUIREDQTY) {
        this.rEQUIREDQTY = rEQUIREDQTY;
    }

    public Integer getUSERGOODQTY() {
        return uSERGOODQTY;
    }

    public void setUSERGOODQTY(Integer uSERGOODQTY) {
        this.uSERGOODQTY = uSERGOODQTY;
    }

    public Integer getCURRENTGOODQTY() {
        return cURRENTGOODQTY;
    }

    public void setCURRENTGOODQTY(Integer cURRENTGOODQTY) {
        this.cURRENTGOODQTY = cURRENTGOODQTY;
    }

    public Integer getCURRENTSCRAPQTY() {
        return cURRENTSCRAPQTY;
    }

    public void setCURRENTSCRAPQTY(Integer cURRENTSCRAPQTY) {
        this.cURRENTSCRAPQTY = cURRENTSCRAPQTY;
    }

    public Integer getINITREQUIREDQTY() {
        return iNITREQUIREDQTY;
    }

    public void setINITREQUIREDQTY(Integer iNITREQUIREDQTY) {
        this.iNITREQUIREDQTY = iNITREQUIREDQTY;
    }

    public Integer getPREVIOUSSCRAPQTY() {
        return pREVIOUSSCRAPQTY;
    }

    public void setPREVIOUSSCRAPQTY(Integer pREVIOUSSCRAPQTY) {
        this.pREVIOUSSCRAPQTY = pREVIOUSSCRAPQTY;
    }

    public Boolean getISSERIALISATION() {
        return iSSERIALISATION;
    }

    public void setISSERIALISATION(Boolean iSSERIALISATION) {
        this.iSSERIALISATION = iSSERIALISATION;
    }

}