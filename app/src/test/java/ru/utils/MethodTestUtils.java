package ru.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang.StringUtils;
import org.codehaus.plexus.util.Base64;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import ru.dto.common.BaseDTO;
import ru.dto.in.MyCriteriaDTO;

import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static ru.common.Constants.CONTROLLER_TAG;

@UtilityClass
public class MethodTestUtils {
    public static RequestBuilder getRequestBuilderGet(String url, String login, String password, String body) {
        return setSettingsRequest(get(CONTROLLER_TAG + url), login, password, body);
    }

    public static RequestBuilder getRequestBuilderPost(String url, String login, String password, String body) {
        return setSettingsRequest(post(CONTROLLER_TAG + url), login, password, body);
    }

    public static RequestBuilder getRequestBuilderPut(String url, String login, String password, String body) {
        return setSettingsRequest(put(CONTROLLER_TAG + url), login, password, body);
    }

    public static RequestBuilder getRequestBuilderDelete(String url, String login, String password, String body) {
        return setSettingsRequest(delete(CONTROLLER_TAG + url), login, password, body);
    }

    private static RequestBuilder setSettingsRequest(MockHttpServletRequestBuilder requestBuilder, String login, String password, String body) {
        return requestBuilder
                .contentType(MediaType.APPLICATION_JSON)
                .content(StringUtils.equals(body, StringUtils.EMPTY) ? Collections.emptyList().toString() : body)
                .header("Authorization", getValueHeaderForAuthorization(login, password))
                .accept(MediaType.APPLICATION_JSON);
    }

    private static String getValueHeaderForAuthorization(String login, String password) {
        return String.format("Basic %s", getEncodeBase64Authorization(login, password));
    }

    private static String getEncodeBase64Authorization(String login, String password) {
        return new String(Base64.encodeBase64((login + ":" + password).getBytes()));
    }

    public static MyCriteriaDTO generateMyCriteriaDto() {
        return MyCriteriaDTO.builder()
                .comment("test")
                .build();
    }

    public static String buildActionParametersContentString(BaseDTO criteriaDTO) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(criteriaDTO);
    }
}
