package com.meroka.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
    //mark class as an Entity
    @Entity
//defining class name as Table name
    @Table
    public class Products
    {
        //Defining book id as primary key
        @Id
        @Column
        private int productid;
        @Column
        private String itemName;
        @Column
        private String team;
        @Column
        private String division;
        @Column
        private String description;
        @Column
        private String link;
        public int getProductid()
        {
            return productid;
        }
        public void setProductid(int itemId)
        {
            this.productid = itemId;
        }
        public String getItemName()
        {
            return itemName;
        }
        public void setItemName(String itemName)
        {
            this.itemName = itemName;
        }
        public String getTeam()
        {
            return team;
        }
        public void setTeam(String team)
        {
            this.team = team;
        }
        public String getDivision()
        {
            return division;
        }
        public void setDivision(String division)
        {
            this.division = division;
        }
        public String getLink()
        {
            return link;
        }
        public void setLink(String link)
        {
            this.link = link;
        }
    }
