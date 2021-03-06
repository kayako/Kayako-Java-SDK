package com.kayako.sdk.helpcenter.locale;

//import com.google.gson.JsonObject;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class LocaleParser implements Parser<Locale> {

    public static final String ITEM_ID = "id";
    public static final String ITEM_LOCALE = "locale";
    public static final String ITEM_NAME = "name";
    public static final String ITEM_NATIVE_NAME = "nativeName";
    public static final String ITEM_REGION = "region";
    public static final String ITEM_NATIVE_REGION = "nativeRegion";
    public static final String ITEM_DIRECTION = "direction";
    public static final String ITEM_IS_PUBLIC = "isPublic";
    public static final String ITEM_IS_LOCALISED = "isLocalised";

    @Override
    public Locale parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource.toString());

        Locale locale = new Locale();

        locale.setId(resourceMap.getAsLong(ITEM_ID));
        locale.setLocale(resourceMap.getAsString(ITEM_LOCALE));
        locale.setName(resourceMap.getAsString(ITEM_NAME));
        locale.setNativeName(resourceMap.getAsString((ITEM_NATIVE_NAME)));
        locale.setLocalized(resourceMap.getAsBoolean((ITEM_IS_LOCALISED)));
        locale.setPublic(resourceMap.getAsBoolean(ITEM_IS_PUBLIC));
        locale.setDirection(resourceMap.getAsString(ITEM_DIRECTION));

        if (resourceMap.hasMember(ITEM_REGION) && resourceMap.isNotNull(ITEM_REGION)) {
            locale.setRegion(resourceMap.getAsString(ITEM_REGION));
        }

        if (resourceMap.hasMember(ITEM_NATIVE_REGION) && resourceMap.isNotNull(ITEM_NATIVE_REGION)) {
            locale.setNativeRegion(resourceMap.getAsString(ITEM_NATIVE_REGION));
        }

        return locale;
    }
}
