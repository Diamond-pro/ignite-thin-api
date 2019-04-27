package com.dfm.thin.model;

import java.io.Serializable;

/**
 * ProductTagsKey definition.
 * 
 * This file was generated by Ignite Web Console (04/27/2019, 18:13)
 **/
public class ProductTagsKey implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for productId. */
    private long productId;

    /** Value for tagId. */
    private long tagId;

    /** Empty constructor. **/
    public ProductTagsKey() {
        // No-op.
    }

    /** Full constructor. **/
    public ProductTagsKey(long productId,
        long tagId) {
        this.productId = productId;
        this.tagId = tagId;
    }

    /**
     * Gets productId
     * 
     * @return Value for productId.
     **/
    public long getProductId() {
        return productId;
    }

    /**
     * Sets productId
     * 
     * @param productId New value for productId.
     **/
    public void setProductId(long productId) {
        this.productId = productId;
    }

    /**
     * Gets tagId
     * 
     * @return Value for tagId.
     **/
    public long getTagId() {
        return tagId;
    }

    /**
     * Sets tagId
     * 
     * @param tagId New value for tagId.
     **/
    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    /** {@inheritDoc} **/
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof ProductTagsKey))
            return false;
        
        ProductTagsKey that = (ProductTagsKey)o;

        if (productId != that.productId)
            return false;
        

        if (tagId != that.tagId)
            return false;
        
        return true;
    }

    /** {@inheritDoc} **/
    @Override public int hashCode() {
        int res = (int)(productId ^ (productId >>> 32));

        res = 31 * res + (int)(tagId ^ (tagId >>> 32));

        return res;
    }

    /** {@inheritDoc} **/
    @Override public String toString() {
        return "ProductTagsKey [" + 
            "productId=" + productId + ", " + 
            "tagId=" + tagId +
        "]";
    }
}