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
@Table(name = "COVIDCASEALLPRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Covidcaseallpro.findAll", query = "SELECT c FROM Covidcaseallpro c"),
    @NamedQuery(name = "Covidcaseallpro.findById", query = "SELECT c FROM Covidcaseallpro c WHERE c.id = :id"),
    @NamedQuery(name = "Covidcaseallpro.findByYears", query = "SELECT c FROM Covidcaseallpro c WHERE c.years = :years"),
    @NamedQuery(name = "Covidcaseallpro.findByWeeknum", query = "SELECT c FROM Covidcaseallpro c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Covidcaseallpro.findByProvince", query = "SELECT c FROM Covidcaseallpro c WHERE c.province = :province"),
    @NamedQuery(name = "Covidcaseallpro.findByNewCase", query = "SELECT c FROM Covidcaseallpro c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Covidcaseallpro.findByTotalCase", query = "SELECT c FROM Covidcaseallpro c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Covidcaseallpro.findByNewCaseExcludeabroad", query = "SELECT c FROM Covidcaseallpro c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Covidcaseallpro.findByTotalCaseExcludeabroad", query = "SELECT c FROM Covidcaseallpro c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Covidcaseallpro.findByNewDeath", query = "SELECT c FROM Covidcaseallpro c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Covidcaseallpro.findByTotalDeath", query = "SELECT c FROM Covidcaseallpro c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Covidcaseallpro.findByUpdateDate", query = "SELECT c FROM Covidcaseallpro c WHERE c.updateDate = :updateDate")})
public class Covidcaseallpro implements Serializable {

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
    @Size(max = 255)
    @Column(name = "PROVINCE")
    private String province;
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

    public Covidcaseallpro() {
    }

    public Covidcaseallpro(Integer id) {
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Covidcaseallpro)) {
            return false;
        }
        Covidcaseallpro other = (Covidcaseallpro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Covidcaseallpro[ id=" + id + " ]";
    }
    
}
