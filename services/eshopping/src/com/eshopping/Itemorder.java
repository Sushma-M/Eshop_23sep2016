/**
 * Copyright (C) 2015 WaveMaker, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eshopping;
// Generated 28 Nov, 2014 11:40:08 AM by Hibernate Tools 7.1.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import javax.persistence.Transient;
import javax.persistence.CascadeType;


/**
 * Itemorder generated by hbm2java
 */
@Entity
@Table(name="ITEMORDER"
    ,schema="PUBLIC"
    ,catalog="PUBLIC"
)
public class Itemorder  implements java.io.Serializable {


     private Integer id;
     private Product product;
     private User user;
     private String status;
     private int quantity;

    public Itemorder() {
    }

    public Itemorder(Product product, User user, String status, int quantity) {
       this.product = product;
       this.user = user;
       this.status = status;
       this.quantity = quantity;
    }

     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="PRODUCT_ID", nullable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="USER_ID", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="STATUS", nullable=false)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="QUANTITY", nullable=false)
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}

