/*
 * $Id: TrackExportModel.java,v 1 2015/01/13 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.model.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * The administrator user contains administrator information.
 * 
 * @author khoapkl
 */
public class TrackExportModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date dateReport;
	private String typeSale;
	private String saleRep;
	private String ccType;
	private String itemSku;
	private String mfgSku;
	private String orderNumber;
	private Date shipDate;
	private String shipToCompany;
	private String shipToLname;
	private String shipToFname;
	private String shipToAddress1;
	private String shipToAddress2;
	private String shipToCity;
	private String shipToState;
	private String shipToPostal;
	private String shipToPhone;
	private int qty;
	private double listPrice;
	private double salePrice;
	private double shippingTotal;
	private double taxTotal;
	private double totalTotal;
	private String billToLname;
	private String billToFname;
	private String billToAddress1;
	private String billToAddress2;
	private String billToCity;
	private String billToState;
	private String billToPostal;
	private int categoryId;
	private String manufacturerId;
	private String mfgPartNumber;
	private String name;
	private String imageUrl;
	private String shortDescription;
	private double weight;
	private String downloadFileName;
	private String receivedBy;
	private Date receivedDate;
	private String warehouseLocation;
	private String status;
	private Date statusDate;
	private double listPrice1;
	private double modifiedPrice;
	private Date modifiedDate;
	private Date warrantyDate;
	private String flagtype;
	private String leaseNumber;
	private String contractNumber;
	private String mfgSku1;
	private String trackingNumber;
	private String shipVia;
	private String attribute01;

	private String attribute02;

	private String attribute03;

	private String attribute04;

	private String attribute05;

	private String attribute06;

	private String attribute07;

	private String attribute08;

	private String attribute09;

	private String attribute10;

	private String attribute11;

	private String attribute12;

	private String attribute13;

	private String attribute14;

	private String attribute15;

	private String attribute16;

	private String attribute17;

	private String attribute18;

	private String attribute19;

	private String attribute20;

	private String attribute21;

	private String attribute22;

	private String attribute23;

	private String attribute24;

	private String attribute25;

	private String attribute26;

	private String attribute27;

	private String attribute28;

	private String attribute29;

	private String attribute30;

	private String attribute31;

	private String attribute32;

	private String attribute33;

	private String attribute34;

	private String attribute35;

	private String attribute36;

	private String attribute37;

	private String attribute38;

	private String attribute39;

	private String attribute40;
	private String custID;
	private String billCompany;
	private double discount;
	private double rmaAmt;

	private String auction;

	private Date closeDate;

	private String shipToEmail;

	private double volumeDiscount;

	private String taxExempt;

	private Date taxExpDate;

	private String loa;

	private double rfAmount;

	/**
	 * @return the attribute01
	 */
	public String getAttribute01() {
		return this.attribute01;
	}

	/**
	 * @return the attribute02
	 */
	public String getAttribute02() {
		return this.attribute02;
	}

	/**
	 * @return the attribute03
	 */
	public String getAttribute03() {
		return this.attribute03;
	}

	/**
	 * @return the attribute04
	 */
	public String getAttribute04() {
		return this.attribute04;
	}

	/**
	 * @return the attribute05
	 */
	public String getAttribute05() {
		return this.attribute05;
	}

	/**
	 * @return the attribute06
	 */
	public String getAttribute06() {
		return this.attribute06;
	}

	/**
	 * @return the attribute07
	 */
	public String getAttribute07() {
		return this.attribute07;
	}

	/**
	 * @return the attribute08
	 */
	public String getAttribute08() {
		return this.attribute08;
	}

	/**
	 * @return the attribute09
	 */
	public String getAttribute09() {
		return this.attribute09;
	}

	/**
	 * @return the attribute10
	 */
	public String getAttribute10() {
		return this.attribute10;
	}

	/**
	 * @return the attribute11
	 */
	public String getAttribute11() {
		return this.attribute11;
	}

	/**
	 * @return the attribute12
	 */
	public String getAttribute12() {
		return this.attribute12;
	}

	/**
	 * @return the attribute13
	 */
	public String getAttribute13() {
		return this.attribute13;
	}

	/**
	 * @return the attribute14
	 */
	public String getAttribute14() {
		return this.attribute14;
	}

	/**
	 * @return the attribute15
	 */
	public String getAttribute15() {
		return this.attribute15;
	}

	/**
	 * @return the attribute16
	 */
	public String getAttribute16() {
		return this.attribute16;
	}

	/**
	 * @return the attribute17
	 */
	public String getAttribute17() {
		return this.attribute17;
	}

	/**
	 * @return the attribute18
	 */
	public String getAttribute18() {
		return this.attribute18;
	}

	/**
	 * @return the attribute19
	 */
	public String getAttribute19() {
		return this.attribute19;
	}

	/**
	 * @return the attribute20
	 */
	public String getAttribute20() {
		return this.attribute20;
	}

	/**
	 * @return the attribute21
	 */
	public String getAttribute21() {
		return this.attribute21;
	}

	/**
	 * @return the attribute22
	 */
	public String getAttribute22() {
		return this.attribute22;
	}

	/**
	 * @return the attribute23
	 */
	public String getAttribute23() {
		return this.attribute23;
	}

	/**
	 * @return the attribute24
	 */
	public String getAttribute24() {
		return this.attribute24;
	}

	/**
	 * @return the attribute25
	 */
	public String getAttribute25() {
		return this.attribute25;
	}

	/**
	 * @return the attribute26
	 */
	public String getAttribute26() {
		return this.attribute26;
	}

	/**
	 * @return the attribute27
	 */
	public String getAttribute27() {
		return this.attribute27;
	}

	/**
	 * @return the attribute28
	 */
	public String getAttribute28() {
		return this.attribute28;
	}

	/**
	 * @return the attribute29
	 */
	public String getAttribute29() {
		return this.attribute29;
	}

	/**
	 * @return the attribute30
	 */
	public String getAttribute30() {
		return this.attribute30;
	}

	/**
	 * @return the attribute31
	 */
	public String getAttribute31() {
		return this.attribute31;
	}

	/**
	 * @return the attribute32
	 */
	public String getAttribute32() {
		return this.attribute32;
	}

	/**
	 * @return the attribute33
	 */
	public String getAttribute33() {
		return this.attribute33;
	}

	/**
	 * @return the attribute34
	 */
	public String getAttribute34() {
		return this.attribute34;
	}

	/**
	 * @return the attribute35
	 */
	public String getAttribute35() {
		return this.attribute35;
	}

	/**
	 * @return the attribute36
	 */
	public String getAttribute36() {
		return this.attribute36;
	}

	/**
	 * @return the attribute37
	 */
	public String getAttribute37() {
		return this.attribute37;
	}

	/**
	 * @return the attribute38
	 */
	public String getAttribute38() {
		return this.attribute38;
	}

	/**
	 * @return the attribute39
	 */
	public String getAttribute39() {
		return this.attribute39;
	}

	/**
	 * @return the attribute40
	 */
	public String getAttribute40() {
		return this.attribute40;
	}

	/**
	 * @return the auction
	 */
	public String getAuction() {
		return this.auction;
	}

	/**
	 * @return the billCompany
	 */
	public String getBillCompany() {
		return this.billCompany;
	}

	/**
	 * @return the billToAddress1
	 */
	public String getBillToAddress1() {
		return this.billToAddress1;
	}

	/**
	 * @return the billToAddress2
	 */
	public String getBillToAddress2() {
		return this.billToAddress2;
	}

	/**
	 * @return the billToCity
	 */
	public String getBillToCity() {
		return this.billToCity;
	}

	/**
	 * @return the billToFname
	 */
	public String getBillToFname() {
		return this.billToFname;
	}

	/**
	 * @return the billToLname
	 */
	public String getBillToLname() {
		return this.billToLname;
	}

	/**
	 * @return the billToPostal
	 */
	public String getBillToPostal() {
		return this.billToPostal;
	}

	/**
	 * @return the billToState
	 */
	public String getBillToState() {
		return this.billToState;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return this.categoryId;
	}

	/**
	 * @return the ccType
	 */
	public String getCcType() {
		return this.ccType;
	}

	/**
	 * @return the closeDate
	 */
	public Date getCloseDate() {
		return this.closeDate;
	}

	/**
	 * @return the contractNumber
	 */
	public String getContractNumber() {
		return this.contractNumber;
	}

	/**
	 * @return the custID
	 */
	public String getCustID() {
		return this.custID;
	}

	/**
	 * @return the dateReport
	 */
	public Date getDateReport() {
		return this.dateReport;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return this.discount;
	}

	/**
	 * @return the downloadFileName
	 */
	public String getDownloadFileName() {
		return this.downloadFileName;
	}

	/**
	 * @return the flagtype
	 */
	public String getFlagtype() {
		return this.flagtype;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}

	/**
	 * @return the itemSku
	 */
	public String getItemSku() {
		return this.itemSku;
	}

	/**
	 * @return the leaseNumber
	 */
	public String getLeaseNumber() {
		return this.leaseNumber;
	}

	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return this.listPrice;
	}

	/**
	 * @return the listPrice1
	 */
	public double getListPrice1() {
		return this.listPrice1;
	}

	/**
	 * @return the loa
	 */
	public String getLoa() {
		return this.loa;
	}

	/**
	 * @return the manufacturerId
	 */
	public String getManufacturerId() {
		return this.manufacturerId;
	}

	/**
	 * @return the mfgPartNumber
	 */
	public String getMfgPartNumber() {
		return this.mfgPartNumber;
	}

	/**
	 * @return the mfgSku
	 */
	public String getMfgSku() {
		return this.mfgSku;
	}

	/**
	 * @return the mfgSku1
	 */
	public String getMfgSku1() {
		return this.mfgSku1;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * @return the modifiedPrice
	 */
	public double getModifiedPrice() {
		return this.modifiedPrice;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return this.qty;
	}

	/**
	 * @return the receivedBy
	 */
	public String getReceivedBy() {
		return this.receivedBy;
	}

	/**
	 * @return the receivedDate
	 */
	public Date getReceivedDate() {
		return this.receivedDate;
	}

	/**
	 * @return the rfAmount
	 */
	public double getRfAmount() {
		return this.rfAmount;
	}

	/**
	 * @return the rmaAmt
	 */
	public double getRmaAmt() {
		return this.rmaAmt;
	}

	/**
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return this.salePrice;
	}

	/**
	 * @return the saleRep
	 */
	public String getSaleRep() {
		return this.saleRep;
	}

	/**
	 * @return the shipDate
	 */
	public Date getShipDate() {
		return this.shipDate;
	}

	/**
	 * @return the shippingTotal
	 */
	public double getShippingTotal() {
		return this.shippingTotal;
	}

	/**
	 * @return the shipToAddress1
	 */
	public String getShipToAddress1() {
		return this.shipToAddress1;
	}

	/**
	 * @return the shipToAddress2
	 */
	public String getShipToAddress2() {
		return this.shipToAddress2;
	}

	/**
	 * @return the shipToCity
	 */
	public String getShipToCity() {
		return this.shipToCity;
	}

	/**
	 * @return the shipToCompany
	 */
	public String getShipToCompany() {
		return this.shipToCompany;
	}

	/**
	 * @return the shipToEmail
	 */
	public String getShipToEmail() {
		return this.shipToEmail;
	}

	/**
	 * @return the shipToFname
	 */
	public String getShipToFname() {
		return this.shipToFname;
	}

	/**
	 * @return the shipToLname
	 */
	public String getShipToLname() {
		return this.shipToLname;
	}

	/**
	 * @return the shipToPhone
	 */
	public String getShipToPhone() {
		return this.shipToPhone;
	}

	/**
	 * @return the shipToPostal
	 */
	public String getShipToPostal() {
		return this.shipToPostal;
	}

	/**
	 * @return the shipToState
	 */
	public String getShipToState() {
		return this.shipToState;
	}

	/**
	 * @return the shipVia
	 */
	public String getShipVia() {
		return this.shipVia;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return this.shortDescription;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @return the statusDate
	 */
	public Date getStatusDate() {
		return this.statusDate;
	}

	/**
	 * @return the taxExempt
	 */
	public String getTaxExempt() {
		return this.taxExempt;
	}

	/**
	 * @return the taxExpDate
	 */
	public Date getTaxExpDate() {
		return this.taxExpDate;
	}

	/**
	 * @return the taxTotal
	 */
	public double getTaxTotal() {
		return this.taxTotal;
	}

	/**
	 * @return the totalTotal
	 */
	public double getTotalTotal() {
		return this.totalTotal;
	}

	/**
	 * @return the trackingNumber
	 */
	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	/**
	 * @return the typeSale
	 */
	public String getTypeSale() {
		return this.typeSale;
	}

	/**
	 * @return the volumeDiscount
	 */
	public double getVolumeDiscount() {
		return this.volumeDiscount;
	}

	/**
	 * @return the warehouseLocation
	 */
	public String getWarehouseLocation() {
		return this.warehouseLocation;
	}

	/**
	 * @return the warrantyDate
	 */
	public Date getWarrantyDate() {
		return this.warrantyDate;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return this.weight;
	}

	/**
	 * @param attribute01
	 *            the attribute01 to set
	 */
	public void setAttribute01(String attribute01) {
		this.attribute01 = attribute01;
	}

	/**
	 * @param attribute02
	 *            the attribute02 to set
	 */
	public void setAttribute02(String attribute02) {
		this.attribute02 = attribute02;
	}

	/**
	 * @param attribute03
	 *            the attribute03 to set
	 */
	public void setAttribute03(String attribute03) {
		this.attribute03 = attribute03;
	}

	/**
	 * @param attribute04
	 *            the attribute04 to set
	 */
	public void setAttribute04(String attribute04) {
		this.attribute04 = attribute04;
	}

	/**
	 * @param attribute05
	 *            the attribute05 to set
	 */
	public void setAttribute05(String attribute05) {
		this.attribute05 = attribute05;
	}

	/**
	 * @param attribute06
	 *            the attribute06 to set
	 */
	public void setAttribute06(String attribute06) {
		this.attribute06 = attribute06;
	}

	/**
	 * @param attribute07
	 *            the attribute07 to set
	 */
	public void setAttribute07(String attribute07) {
		this.attribute07 = attribute07;
	}

	/**
	 * @param attribute08
	 *            the attribute08 to set
	 */
	public void setAttribute08(String attribute08) {
		this.attribute08 = attribute08;
	}

	/**
	 * @param attribute09
	 *            the attribute09 to set
	 */
	public void setAttribute09(String attribute09) {
		this.attribute09 = attribute09;
	}

	/**
	 * @param attribute10
	 *            the attribute10 to set
	 */
	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
	}

	/**
	 * @param attribute11
	 *            the attribute11 to set
	 */
	public void setAttribute11(String attribute11) {
		this.attribute11 = attribute11;
	}

	/**
	 * @param attribute12
	 *            the attribute12 to set
	 */
	public void setAttribute12(String attribute12) {
		this.attribute12 = attribute12;
	}

	/**
	 * @param attribute13
	 *            the attribute13 to set
	 */
	public void setAttribute13(String attribute13) {
		this.attribute13 = attribute13;
	}

	/**
	 * @param attribute14
	 *            the attribute14 to set
	 */
	public void setAttribute14(String attribute14) {
		this.attribute14 = attribute14;
	}

	/**
	 * @param attribute15
	 *            the attribute15 to set
	 */
	public void setAttribute15(String attribute15) {
		this.attribute15 = attribute15;
	}

	/**
	 * @param attribute16
	 *            the attribute16 to set
	 */
	public void setAttribute16(String attribute16) {
		this.attribute16 = attribute16;
	}

	/**
	 * @param attribute17
	 *            the attribute17 to set
	 */
	public void setAttribute17(String attribute17) {
		this.attribute17 = attribute17;
	}

	/**
	 * @param attribute18
	 *            the attribute18 to set
	 */
	public void setAttribute18(String attribute18) {
		this.attribute18 = attribute18;
	}

	/**
	 * @param attribute19
	 *            the attribute19 to set
	 */
	public void setAttribute19(String attribute19) {
		this.attribute19 = attribute19;
	}

	/**
	 * @param attribute20
	 *            the attribute20 to set
	 */
	public void setAttribute20(String attribute20) {
		this.attribute20 = attribute20;
	}

	/**
	 * @param attribute21
	 *            the attribute21 to set
	 */
	public void setAttribute21(String attribute21) {
		this.attribute21 = attribute21;
	}

	/**
	 * @param attribute22
	 *            the attribute22 to set
	 */
	public void setAttribute22(String attribute22) {
		this.attribute22 = attribute22;
	}

	/**
	 * @param attribute23
	 *            the attribute23 to set
	 */
	public void setAttribute23(String attribute23) {
		this.attribute23 = attribute23;
	}

	/**
	 * @param attribute24
	 *            the attribute24 to set
	 */
	public void setAttribute24(String attribute24) {
		this.attribute24 = attribute24;
	}

	/**
	 * @param attribute25
	 *            the attribute25 to set
	 */
	public void setAttribute25(String attribute25) {
		this.attribute25 = attribute25;
	}

	/**
	 * @param attribute26
	 *            the attribute26 to set
	 */
	public void setAttribute26(String attribute26) {
		this.attribute26 = attribute26;
	}

	/**
	 * @param attribute27
	 *            the attribute27 to set
	 */
	public void setAttribute27(String attribute27) {
		this.attribute27 = attribute27;
	}

	/**
	 * @param attribute28
	 *            the attribute28 to set
	 */
	public void setAttribute28(String attribute28) {
		this.attribute28 = attribute28;
	}

	/**
	 * @param attribute29
	 *            the attribute29 to set
	 */
	public void setAttribute29(String attribute29) {
		this.attribute29 = attribute29;
	}

	/**
	 * @param attribute30
	 *            the attribute30 to set
	 */
	public void setAttribute30(String attribute30) {
		this.attribute30 = attribute30;
	}

	/**
	 * @param attribute31
	 *            the attribute31 to set
	 */
	public void setAttribute31(String attribute31) {
		this.attribute31 = attribute31;
	}

	/**
	 * @param attribute32
	 *            the attribute32 to set
	 */
	public void setAttribute32(String attribute32) {
		this.attribute32 = attribute32;
	}

	/**
	 * @param attribute33
	 *            the attribute33 to set
	 */
	public void setAttribute33(String attribute33) {
		this.attribute33 = attribute33;
	}

	/**
	 * @param attribute34
	 *            the attribute34 to set
	 */
	public void setAttribute34(String attribute34) {
		this.attribute34 = attribute34;
	}

	/**
	 * @param attribute35
	 *            the attribute35 to set
	 */
	public void setAttribute35(String attribute35) {
		this.attribute35 = attribute35;
	}

	/**
	 * @param attribute36
	 *            the attribute36 to set
	 */
	public void setAttribute36(String attribute36) {
		this.attribute36 = attribute36;
	}

	/**
	 * @param attribute37
	 *            the attribute37 to set
	 */
	public void setAttribute37(String attribute37) {
		this.attribute37 = attribute37;
	}

	/**
	 * @param attribute38
	 *            the attribute38 to set
	 */
	public void setAttribute38(String attribute38) {
		this.attribute38 = attribute38;
	}

	/**
	 * @param attribute39
	 *            the attribute39 to set
	 */
	public void setAttribute39(String attribute39) {
		this.attribute39 = attribute39;
	}

	/**
	 * @param attribute40
	 *            the attribute40 to set
	 */
	public void setAttribute40(String attribute40) {
		this.attribute40 = attribute40;
	}

	/**
	 * @param auction
	 *            the auction to set
	 */
	public void setAuction(String auction) {
		this.auction = auction;
	}

	/**
	 * @param billCompany
	 *            the billCompany to set
	 */
	public void setBillCompany(String billCompany) {
		this.billCompany = billCompany;
	}

	/**
	 * @param billToAddress1
	 *            the billToAddress1 to set
	 */
	public void setBillToAddress1(String billToAddress1) {
		this.billToAddress1 = billToAddress1;
	}

	/**
	 * @param billToAddress2
	 *            the billToAddress2 to set
	 */
	public void setBillToAddress2(String billToAddress2) {
		this.billToAddress2 = billToAddress2;
	}

	/**
	 * @param billToCity
	 *            the billToCity to set
	 */
	public void setBillToCity(String billToCity) {
		this.billToCity = billToCity;
	}

	/**
	 * @param billToFname
	 *            the billToFname to set
	 */
	public void setBillToFname(String billToFname) {
		this.billToFname = billToFname;
	}

	/**
	 * @param billToLname
	 *            the billToLname to set
	 */
	public void setBillToLname(String billToLname) {
		this.billToLname = billToLname;
	}

	/**
	 * @param billToPostal
	 *            the billToPostal to set
	 */
	public void setBillToPostal(String billToPostal) {
		this.billToPostal = billToPostal;
	}

	/**
	 * @param billToState
	 *            the billToState to set
	 */
	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @param ccType
	 *            the ccType to set
	 */
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	/**
	 * @param closeDate
	 *            the closeDate to set
	 */
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	/**
	 * @param contractNumber
	 *            the contractNumber to set
	 */
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	/**
	 * @param custID
	 *            the custID to set
	 */
	public void setCustID(String custID) {
		this.custID = custID;
	}

	/**
	 * @param dateReport
	 *            the dateReport to set
	 */
	public void setDateReport(Date dateReport) {
		this.dateReport = dateReport;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/**
	 * @param downloadFileName
	 *            the downloadFileName to set
	 */
	public void setDownloadFileName(String downloadFileName) {
		this.downloadFileName = downloadFileName;
	}

	/**
	 * @param flagtype
	 *            the flagtype to set
	 */
	public void setFlagtype(String flagtype) {
		this.flagtype = flagtype;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @param itemSku
	 *            the itemSku to set
	 */
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}

	/**
	 * @param leaseNumber
	 *            the leaseNumber to set
	 */
	public void setLeaseNumber(String leaseNumber) {
		this.leaseNumber = leaseNumber;
	}

	/**
	 * @param listPrice
	 *            the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * @param listPrice1
	 *            the listPrice1 to set
	 */
	public void setListPrice1(double listPrice1) {
		this.listPrice1 = listPrice1;
	}

	/**
	 * @param loa
	 *            the loa to set
	 */
	public void setLoa(String loa) {
		this.loa = loa;
	}

	/**
	 * @param manufacturerId
	 *            the manufacturerId to set
	 */
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	/**
	 * @param mfgPartNumber
	 *            the mfgPartNumber to set
	 */
	public void setMfgPartNumber(String mfgPartNumber) {
		this.mfgPartNumber = mfgPartNumber;
	}

	/**
	 * @param mfgSku
	 *            the mfgSku to set
	 */
	public void setMfgSku(String mfgSku) {
		this.mfgSku = mfgSku;
	}

	/**
	 * @param mfgSku1
	 *            the mfgSku1 to set
	 */
	public void setMfgSku1(String mfgSku1) {
		this.mfgSku1 = mfgSku1;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @param modifiedPrice
	 *            the modifiedPrice to set
	 */
	public void setModifiedPrice(double modifiedPrice) {
		this.modifiedPrice = modifiedPrice;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param orderNumber
	 *            the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @param receivedBy
	 *            the receivedBy to set
	 */
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	/**
	 * @param receivedDate
	 *            the receivedDate to set
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	/**
	 * @param rfAmount
	 *            the rfAmount to set
	 */
	public void setRfAmount(double rfAmount) {
		this.rfAmount = rfAmount;
	}

	/**
	 * @param rmaAmt
	 *            the rmaAmt to set
	 */
	public void setRmaAmt(double rmaAmt) {
		this.rmaAmt = rmaAmt;
	}

	/**
	 * @param salePrice
	 *            the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * @param saleRep
	 *            the saleRep to set
	 */
	public void setSaleRep(String saleRep) {
		this.saleRep = saleRep;
	}

	/**
	 * @param shipDate
	 *            the shipDate to set
	 */
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	/**
	 * @param shippingTotal
	 *            the shippingTotal to set
	 */
	public void setShippingTotal(double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * @param shipToAddress1
	 *            the shipToAddress1 to set
	 */
	public void setShipToAddress1(String shipToAddress1) {
		this.shipToAddress1 = shipToAddress1;
	}

	/**
	 * @param shipToAddress2
	 *            the shipToAddress2 to set
	 */
	public void setShipToAddress2(String shipToAddress2) {
		this.shipToAddress2 = shipToAddress2;
	}

	/**
	 * @param shipToCity
	 *            the shipToCity to set
	 */
	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}

	/**
	 * @param shipToCompany
	 *            the shipToCompany to set
	 */
	public void setShipToCompany(String shipToCompany) {
		this.shipToCompany = shipToCompany;
	}

	/**
	 * @param shipToEmail
	 *            the shipToEmail to set
	 */
	public void setShipToEmail(String shipToEmail) {
		this.shipToEmail = shipToEmail;
	}

	/**
	 * @param shipToFname
	 *            the shipToFname to set
	 */
	public void setShipToFname(String shipToFname) {
		this.shipToFname = shipToFname;
	}

	/**
	 * @param shipToLname
	 *            the shipToLname to set
	 */
	public void setShipToLname(String shipToLname) {
		this.shipToLname = shipToLname;
	}

	/**
	 * @param shipToPhone
	 *            the shipToPhone to set
	 */
	public void setShipToPhone(String shipToPhone) {
		this.shipToPhone = shipToPhone;
	}

	/**
	 * @param shipToPostal
	 *            the shipToPostal to set
	 */
	public void setShipToPostal(String shipToPostal) {
		this.shipToPostal = shipToPostal;
	}

	/**
	 * @param shipToState
	 *            the shipToState to set
	 */
	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	/**
	 * @param shipVia
	 *            the shipVia to set
	 */
	public void setShipVia(String shipVia) {
		this.shipVia = shipVia;
	}

	/**
	 * @param shortDescription
	 *            the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param statusDate
	 *            the statusDate to set
	 */
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	/**
	 * @param taxExempt
	 *            the taxExempt to set
	 */
	public void setTaxExempt(String taxExempt) {
		this.taxExempt = taxExempt;
	}

	/**
	 * @param taxExpDate
	 *            the taxExpDate to set
	 */
	public void setTaxExpDate(Date taxExpDate) {
		this.taxExpDate = taxExpDate;
	}

	/**
	 * @param taxTotal
	 *            the taxTotal to set
	 */
	public void setTaxTotal(double taxTotal) {
		this.taxTotal = taxTotal;
	}
	/**
	 * @param totalTotal
	 *            the totalTotal to set
	 */
	public void setTotalTotal(double totalTotal) {
		this.totalTotal = totalTotal;
	}
	/**
	 * @param trackingNumber
	 *            the trackingNumber to set
	 */
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	/**
	 * @param typeSale
	 *            the typeSale to set
	 */
	public void setTypeSale(String typeSale) {
		this.typeSale = typeSale;
	}
	/**
	 * @param volumeDiscount
	 *            the volumeDiscount to set
	 */
	public void setVolumeDiscount(double volumeDiscount) {
		this.volumeDiscount = volumeDiscount;
	}
	/**
	 * @param warehouseLocation
	 *            the warehouseLocation to set
	 */
	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}
	/**
	 * @param warrantyDate
	 *            the warrantyDate to set
	 */
	public void setWarrantyDate(Date warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
