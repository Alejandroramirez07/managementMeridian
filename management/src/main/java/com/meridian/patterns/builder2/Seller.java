package com.meridian.patterns.builder2;

public class Seller {
    private final long totalSales;
    private final String sellerName;
    private final String supervisor;

    private Seller (SellerBuilder sellerBuilder){
        this.totalSales=sellerBuilder.totalSales;
        this.sellerName=sellerBuilder.sellerName;
        this.supervisor=sellerBuilder.supervisor;
    }

    public static class SellerBuilder{
        private long totalSales;
        private String sellerName;
        private String supervisor;

        public SellerBuilder(long totalSales, String sellerName){
            this.totalSales=totalSales;
            this.sellerName=sellerName;
        }

        public SellerBuilder supervisor (String supervisor){
            this.supervisor=supervisor;
            return this;
        }

        public Seller build(){
            return new Seller(this);
        }

    }


}
