/*
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CandleApi
 */
@Ignore
public class CandleApiTest {

    private final CandleApi api = new CandleApi();

    
    /**
     * 시세 캔들 조회 (일 단위)
     *
     * ## 일(Day) 캔들 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void candleDaysTest() throws ApiException {
        String market = null;
        String to = null;
        BigDecimal count = null;
        String convertingPriceUnit = null;
        Object response = api.candleDays(market, to, count, convertingPriceUnit);

        // TODO: test validations
    }
    
    /**
     * 시세 캔들 조회 (분 단위)
     *
     * ## 분(Minute) 캔들 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void candleMinutesTest() throws ApiException {
        Integer unit = null;
        String market = null;
        String to = null;
        BigDecimal count = null;
        Object response = api.candleMinutes(unit, market, to, count);

        // TODO: test validations
    }
    
    /**
     * 시세 캔들 조회 (월 단위)
     *
     * ## 월(Month) 캔들 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void candleMonthTest() throws ApiException {
        String market = null;
        String to = null;
        BigDecimal count = null;
        Object response = api.candleMonth(market, to, count);

        // TODO: test validations
    }
    
    /**
     * 시세 캔들 조회 (주 단위)
     *
     * ## 주(Week) 캔들 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void candleWeeksTest() throws ApiException {
        String market = null;
        String to = null;
        BigDecimal count = null;
        Object response = api.candleWeeks(market, to, count);

        // TODO: test validations
    }
    
}
