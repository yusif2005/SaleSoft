/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesoft.database;

/**
 * Bu Class-da SQL sorgularimi saxlayacam Cox Gozel Bir shekilde, her iki novde
 * biri PreparedStatement-ucun digeri ise, oz yontemim ile yani
 * String.replaceAll metodu ile, bu nece ishledyir? SQL sorguda ? (Sual)
 * isharesi yerine yaziram meselen String TEST_BY_TYPE_R = ("blablabla where
 * type=typeR") sonra hemin SQL-i aliram meselen SQL.TEST_BY_TYPE_R sonra ordaki
 * sozu deyishirem bucur, String SQL =
 * SQL.TEST_BY_TYPE_R.replaceAll("typeR","'url'"); neticede hazir SQL sorgu
 * aliram blablabla where type='url'; ve bu sorgunu gonderirem DBUtil
 * Classimizin dbExecuteQuery Funksiyasina ve bize lazim olan neticeni aliriq.
 * Bunu sirf DBUtil Classimla ishlemek ucun teshkil elemishem, cunki bu class
 * xoshuma geldi, ve bunun sayesinde elave kod yazmayacam, meselen
 * PreparedStatement kimi. Yoxlayaq gorek neqeder kodumuzu azaldacaq ve ishimi
 * asandlashdiracaq.
 *
 * @author Ramin
 */
public class SQL {

    /**
     * Butun mehsullari almaq ucun istifade olunur (SELECT * ...)
     */
    public static final String PRODUCT_GET_ALL = "SELECT * FROM " + TableNames.productTableName;

    /**
     * SQL For PreparedStatement, id=? (SELECT * ... WHERE id=?)
     */
    public static final String PRODUCT_GET_BY_ID_P = "SELECT * FROM " + TableNames.productTableName + " WHERE id=?";

    /**
     * SQL For ReplaceAll, id=idR (SELECT * ... WHERE id=idR)
     */
    public static final String PRODUCT_GET_BY_ID_R = "SELECT * FROM " + TableNames.productTableName + " WHERE id=idR";

    /**
     * SQL For PreparedStatement, barcode=?
     */
    public static final String PRODUCT_GET_BY_BARCODE_P = "SELECT * FROM " + TableNames.productTableName + " WHERE barcode=?";

    /**
     * SQL For ReplaceAll, barcode=barcodeR
     */
    public static final String PRODUCT_GET_BY_BARCODE_R = "SELECT * FROM " + TableNames.productTableName + " WHERE barcode='barcodeR'";

    /**
     * SQL For PreparedStatement, ad LIKE=?
     */
    public static final String PRODUCT_GEL_ALL_BY_NAME_LIKE_P = "SELECT * FROM " + TableNames.productTableName + " WHERE ad LIKE ?";

    /**
     * SQL For ReplaceAll, ad LIKE=adR
     */
    public static final String PRODUCT_GEL_ALL_BY_NAME_LIKE_R = "SELECT * FROM " + TableNames.productTableName + " WHERE ad LIKE 'adR'";

    /**
     * SQL For PreparedStatement, barcode=?
     */
    public static final String PRODUCT_GEL_ALL_BY_BARCODE_P = "SELECT * FROM " + TableNames.productTableName + " WHERE barcode=?";

    /**
     * SQL For ReplaceAll, barcode=barcodeR
     */
    public static final String PRODUCT_GEL_ALL_BY_BARCODE_R = "SELECT * FROM " + TableNames.productTableName + " WHERE barcode=barcodeR";

}