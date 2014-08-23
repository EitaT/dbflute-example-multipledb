/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon;

import java.util.*;

import org.seasar.dbflute.jdbc.Classification;
import org.seasar.dbflute.jdbc.ClassificationCodeType;
import org.seasar.dbflute.jdbc.ClassificationMeta;
import org.seasar.dbflute.jdbc.ClassificationUndefinedHandlingType;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface LdCDef extends Classification {

    /** The empty array for no sisters. */
    String[] EMPTY_SISTERS = new String[]{};

    /** The empty map for no sub-items. */
    @SuppressWarnings("unchecked")
    Map<String, Object> EMPTY_SUB_ITEM_MAP = (Map<String, Object>)Collections.EMPTY_MAP;

    /**
     * はいいいえを示す
     */
    public enum YesNo implements LdCDef {
        /** はい */
        Yes("y", "はい", EMPTY_SISTERS)
        ,
        /** いいえ */
        No("n", "いいえ", EMPTY_SISTERS)
        ;
        private static final Map<String, YesNo> _codeValueMap = new HashMap<String, YesNo>();
        static {
            for (YesNo value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private YesNo(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return LdCDef.DefMeta.YesNo; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static YesNo codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof YesNo) { return (YesNo)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static YesNo nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<YesNo> listAll() {
            return new ArrayList<YesNo>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<YesNo> groupOf(String groupName) {
            return new ArrayList<YesNo>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * 蔵書の状態を示す
     */
    public enum CollectionStatus implements LdCDef {
        /** NOR: 通常状態を示す */
        NOR("NOR", "NOR", EMPTY_SISTERS)
        ,
        /** WAT: 待ち状態を示す */
        WAT("WAT", "WAT", EMPTY_SISTERS)
        ,
        /** OUT: 貸し出し中を示す */
        OUT("OUT", "OUT", EMPTY_SISTERS)
        ;
        private static final Map<String, CollectionStatus> _codeValueMap = new HashMap<String, CollectionStatus>();
        static {
            for (CollectionStatus value : values()) {
                _codeValueMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisters()) { _codeValueMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private String[] _sisters;
        private CollectionStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisters = sisters; }
        public String code() { return _code; } public String alias() { return _alias; }
        private String[] sisters() { return _sisters; }
        public Map<String, Object> subItemMap() { return EMPTY_SUB_ITEM_MAP; }
        public ClassificationMeta meta() { return LdCDef.DefMeta.CollectionStatus; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static CollectionStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof CollectionStatus) { return (CollectionStatus)code; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static CollectionStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        public static List<CollectionStatus> listAll() {
            return new ArrayList<CollectionStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        public static List<CollectionStatus> groupOf(String groupName) {
            return new ArrayList<CollectionStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** はいいいえを示す */
        YesNo
        ,
        /** 蔵書の状態を示す */
        CollectionStatus
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public Classification codeOf(Object code) {
            if ("YesNo".equals(name())) { return LdCDef.YesNo.codeOf(code); }
            if ("CollectionStatus".equals(name())) { return LdCDef.CollectionStatus.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification nameOf(String name) {
            if ("YesNo".equals(name())) { return LdCDef.YesNo.valueOf(name); }
            if ("CollectionStatus".equals(name())) { return LdCDef.CollectionStatus.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listAll() {
            if ("YesNo".equals(name())) { return toClassificationList(LdCDef.YesNo.listAll()); }
            if ("CollectionStatus".equals(name())) { return toClassificationList(LdCDef.CollectionStatus.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> groupOf(String groupName) {
            if ("YesNo".equals(name())) { return toClassificationList(LdCDef.YesNo.groupOf(groupName)); }
            if ("CollectionStatus".equals(name())) { return toClassificationList(LdCDef.CollectionStatus.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<Classification> toClassificationList(List<?> clsList) {
            return (List<Classification>)clsList;
        }

        public ClassificationCodeType codeType() {
            if ("YesNo".equals(name())) { return ClassificationCodeType.String; }
            if ("CollectionStatus".equals(name())) { return ClassificationCodeType.String; }
            return ClassificationCodeType.String; // as default
        }

        public ClassificationUndefinedHandlingType undefinedHandlingType() {
            if ("YesNo".equals(name())) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("CollectionStatus".equals(name())) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            return ClassificationUndefinedHandlingType.LOGGING; // as default
        }
    }
}
