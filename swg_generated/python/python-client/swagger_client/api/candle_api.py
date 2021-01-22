# coding: utf-8

"""
    Upbit Open API

    ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com]   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: ujhin942@gmail.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class CandleApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def candle_days(self, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (일 단위)  # noqa: E501

        ## 일(Day) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_days(market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 
        :param str converting_price_unit: 종가 환산 화폐 단위 (생략 가능, KRW로 명시할 시 원화 환산 가격을 반환.)  `convertingPriceUnit` 파라미터의 경우, 원화 마켓이 아닌 다른 마켓(ex. BTC, ETH)의 일봉 요청 시 종가를 명시된 파라미터 값으로 환산해 `converted_trade_price` 필드에 추가하여 반환합니다. 현재는 원화(`KRW`) 로 변환하는 기능만 제공하며 추후 기능을 확장할 수 있습니다. 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.candle_days_with_http_info(market, **kwargs)  # noqa: E501
        else:
            (data) = self.candle_days_with_http_info(market, **kwargs)  # noqa: E501
            return data

    def candle_days_with_http_info(self, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (일 단위)  # noqa: E501

        ## 일(Day) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_days_with_http_info(market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 
        :param str converting_price_unit: 종가 환산 화폐 단위 (생략 가능, KRW로 명시할 시 원화 환산 가격을 반환.)  `convertingPriceUnit` 파라미터의 경우, 원화 마켓이 아닌 다른 마켓(ex. BTC, ETH)의 일봉 요청 시 종가를 명시된 파라미터 값으로 환산해 `converted_trade_price` 필드에 추가하여 반환합니다. 현재는 원화(`KRW`) 로 변환하는 기능만 제공하며 추후 기능을 확장할 수 있습니다. 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['market', 'to', 'count', 'converting_price_unit']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method candle_days" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'market' is set
        if ('market' not in params or
                params['market'] is None):
            raise ValueError("Missing the required parameter `market` when calling `candle_days`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'market' in params:
            query_params.append(('market', params['market']))  # noqa: E501
        if 'to' in params:
            query_params.append(('to', params['to']))  # noqa: E501
        if 'count' in params:
            query_params.append(('count', params['count']))  # noqa: E501
        if 'converting_price_unit' in params:
            query_params.append(('convertingPriceUnit', params['converting_price_unit']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['Bearer']  # noqa: E501

        return self.api_client.call_api(
            '/candles/days', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def candle_minutes(self, unit, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (분 단위)  # noqa: E501

        ## 분(Minute) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_minutes(unit, market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int unit: 분 단위. 가능한 값 : 1, 3, 5, 15, 10, 30, 60, 240  (required)
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 (최대 200개까지 요청 가능) 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.candle_minutes_with_http_info(unit, market, **kwargs)  # noqa: E501
        else:
            (data) = self.candle_minutes_with_http_info(unit, market, **kwargs)  # noqa: E501
            return data

    def candle_minutes_with_http_info(self, unit, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (분 단위)  # noqa: E501

        ## 분(Minute) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_minutes_with_http_info(unit, market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int unit: 분 단위. 가능한 값 : 1, 3, 5, 15, 10, 30, 60, 240  (required)
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 (최대 200개까지 요청 가능) 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['unit', 'market', 'to', 'count']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method candle_minutes" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'unit' is set
        if ('unit' not in params or
                params['unit'] is None):
            raise ValueError("Missing the required parameter `unit` when calling `candle_minutes`")  # noqa: E501
        # verify the required parameter 'market' is set
        if ('market' not in params or
                params['market'] is None):
            raise ValueError("Missing the required parameter `market` when calling `candle_minutes`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'unit' in params:
            path_params['unit'] = params['unit']  # noqa: E501

        query_params = []
        if 'market' in params:
            query_params.append(('market', params['market']))  # noqa: E501
        if 'to' in params:
            query_params.append(('to', params['to']))  # noqa: E501
        if 'count' in params:
            query_params.append(('count', params['count']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['Bearer']  # noqa: E501

        return self.api_client.call_api(
            '/candles/minutes/{unit}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def candle_month(self, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (월 단위)  # noqa: E501

        ## 월(Month) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_month(market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.candle_month_with_http_info(market, **kwargs)  # noqa: E501
        else:
            (data) = self.candle_month_with_http_info(market, **kwargs)  # noqa: E501
            return data

    def candle_month_with_http_info(self, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (월 단위)  # noqa: E501

        ## 월(Month) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_month_with_http_info(market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['market', 'to', 'count']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method candle_month" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'market' is set
        if ('market' not in params or
                params['market'] is None):
            raise ValueError("Missing the required parameter `market` when calling `candle_month`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'market' in params:
            query_params.append(('market', params['market']))  # noqa: E501
        if 'to' in params:
            query_params.append(('to', params['to']))  # noqa: E501
        if 'count' in params:
            query_params.append(('count', params['count']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['Bearer']  # noqa: E501

        return self.api_client.call_api(
            '/candles/months', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def candle_weeks(self, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (주 단위)  # noqa: E501

        ## 주(Week) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_weeks(market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.candle_weeks_with_http_info(market, **kwargs)  # noqa: E501
        else:
            (data) = self.candle_weeks_with_http_info(market, **kwargs)  # noqa: E501
            return data

    def candle_weeks_with_http_info(self, market, **kwargs):  # noqa: E501
        """시세 캔들 조회 (주 단위)  # noqa: E501

        ## 주(Week) 캔들   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.candle_weeks_with_http_info(market, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str market: 마켓 코드 (ex. KRW-BTC)  (required)
        :param str to: 마지막 캔들 시각 (exclusive). 포맷 : `yyyy-MM-dd'T'HH:mm:ssXXX` or `yyyy-MM-dd HH:mm:ss`. 비워서 요청 시 가장 최근 캔들 
        :param float count: 캔들 개수 
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['market', 'to', 'count']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method candle_weeks" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'market' is set
        if ('market' not in params or
                params['market'] is None):
            raise ValueError("Missing the required parameter `market` when calling `candle_weeks`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'market' in params:
            query_params.append(('market', params['market']))  # noqa: E501
        if 'to' in params:
            query_params.append(('to', params['to']))  # noqa: E501
        if 'count' in params:
            query_params.append(('count', params['count']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['Bearer']  # noqa: E501

        return self.api_client.call_api(
            '/candles/weeks', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
