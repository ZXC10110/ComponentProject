/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kanya
 */
@Entity
@Table(name = "COVIDROUND1TO2ALL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Covidround1to2all.findAll", query = "SELECT c FROM Covidround1to2all c"),
    @NamedQuery(name = "Covidround1to2all.findById", query = "SELECT c FROM Covidround1to2all c WHERE c.id = :id"),
    @NamedQuery(name = "Covidround1to2all.findByYears", query = "SELECT c FROM Covidround1to2all c WHERE c.years = :years"),
    @NamedQuery(name = "Covidround1to2all.findByWeeknum", query = "SELECT c FROM Covidround1to2all c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Covidround1to2all.findByNewCase", query = "SELECT c FROM Covidround1to2all c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Covidround1to2all.findByTotalCase", query = "SELECT c FROM Covidround1to2all c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Covidround1to2all.findByNewCaseExcludeabroad", query = "SELECT c FROM Covidround1to2all c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Covidround1to2all.findByTotalCaseExcludeabroad", query = "SELECT c FROM Covidround1to2all c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Covidround1to2all.findByNewDeath", query = "SELECT c FROM Covidround1to2all c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Covidround1to2all.findByTotalDeath", query = "SELECT c FROM Covidround1to2all c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Covidround1to2all.findByUpdateDate", query = "SELECT c FROM Covidround1to2all c WHERE c.updateDate = :updateDate"),
    @NamedQuery(name = "Covidround1to2all.findByNewRecovered", query = "SELECT c FROM Covidround1to2all c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "Covidround1to2all.findByTotalRecovered", query = "SELECT c FROM Covidround1to2all c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Covidround1to2all.findByCaseForeign", query = "SELECT c FROM Covidround1to2all c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "Covidround1to2all.findByCasePrison", query = "SELECT c FROM Covidround1to2all c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "Covidround1to2all.findByCaseWalkin", query = "SELECT c FROM Covidround1to2all c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Covidround1to2all.findByCaseNewPrev", query = "SELECT c FROM Covidround1to2all c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Covidround1to2all.findByCaseNewDiff", query = "SELECT c FROM Covidround1to2all c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Covidround1to2all.findByDeathNewPrev", query = "SELECT c FROM Covidround1to2all c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Covidround1to2all.findByDeathNewDiff", query = "SELECT c FROM Covidround1to2all c WHERE c.deathNewDiff = :deathNewDiff")})
public class Covidround1to2all implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "YEARS")
    private Integer years;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Size(max = 255)
    @Column(name = "UPDATE_DATE")
    private String updateDate;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;

    public Covidround1to2all() {
    }

    public Covidround1to2all(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Covidround1to2all)) {
            return false;
        }
        Covidround1to2all other = (Covidround1to2all) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Covidround1to2all[ id=" + id + " ]";
    }
    
}
