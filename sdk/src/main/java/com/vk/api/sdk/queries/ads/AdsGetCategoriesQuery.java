package com.vk.api.sdk.queries.ads;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.ads.Category;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Ads.getCategories method
 */
public class AdsGetCategoriesQuery extends AbstractQueryBuilder<AdsGetCategoriesQuery, List<Category>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AdsGetCategoriesQuery(VkApiClient client, Actor actor) {
        super(client, "ads.getCategories", Utils.buildParametrizedType(List.class, Category.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Language. The full list of supported languages is here.
     *
     * @param value value of "lang" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AdsGetCategoriesQuery lang(String value) {
        return unsafeParam("lang", value);
    }

    @Override
    protected AdsGetCategoriesQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
