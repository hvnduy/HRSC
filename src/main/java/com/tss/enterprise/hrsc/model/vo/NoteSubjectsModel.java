/*
 * $Id: NoteSubjectsModel.java,v 1 2015/01/13 13:58:00 Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.tss.enterprise.hrsc.model.vo;

import java.io.Serializable;

/**
 * The order header contains header information.
 * 
 * @author khoapkl
 */
public class NoteSubjectsModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int indexKey;

	private String subject;

	private int orderBy;

	private String noteType;

	/**
	 * @return the indexKey
	 */
	public int getIndexKey() {
		return this.indexKey;
	}

	/**
	 * @return the noteType
	 */
	public String getNoteType() {
		return this.noteType;
	}

	/**
	 * @return the orderBy
	 */
	public int getOrderBy() {
		return this.orderBy;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return this.subject;
	}

	/**
	 * @param indexKey
	 *            the indexKey to set
	 */
	public void setIndexKey(int indexKey) {
		this.indexKey = indexKey;
	}

	/**
	 * @param noteType
	 *            the noteType to set
	 */
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}

	/**
	 * @param orderBy
	 *            the orderBy to set
	 */
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
