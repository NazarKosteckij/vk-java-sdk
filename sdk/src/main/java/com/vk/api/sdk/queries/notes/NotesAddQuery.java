package com.vk.api.sdk.queries.notes;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Notes.add method
 */
public class NotesAddQuery extends AbstractQueryBuilder<NotesAddQuery, Integer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param title  value of "title" parameter.
     * @param text   value of "text" parameter.
     */
    public NotesAddQuery(VkApiClient client, Actor actor, String title, String text) {
        super(client, "notes.add", Integer.class);
        accessToken(actor.getAccessToken());
        title(title);
        text(text);
    }

    /**
     * Note title.
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesAddQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Note text.
     *
     * @param value value of "text" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected NotesAddQuery text(String value) {
        return unsafeParam("text", value);
    }

    /**
     * Set privacy view
     *
     * @param value value of "privacy view" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesAddQuery privacyView(String... value) {
        return unsafeParam("privacy_view", value);
    }

    /**
     * Set privacy comment
     *
     * @param value value of "privacy comment" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public NotesAddQuery privacyComment(String... value) {
        return unsafeParam("privacy_comment", value);
    }

    @Override
    protected NotesAddQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("text", "title", "access_token");
    }
}
