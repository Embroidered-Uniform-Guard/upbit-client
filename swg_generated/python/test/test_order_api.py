# coding: utf-8

"""
    Upbit Open API

    ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com]   # noqa: E501

    OpenAPI spec version: 1.1.6
    Contact: ujhin942@gmail.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.order_api import OrderApi  # noqa: E501
from swagger_client.rest import ApiException


class TestOrderApi(unittest.TestCase):
    """OrderApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.order_api.OrderApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_order_cancel(self):
        """Test case for order_cancel

        주문 취소 접수  # noqa: E501
        """
        pass

    def test_order_chance(self):
        """Test case for order_chance

        주문 가능 정보  # noqa: E501
        """
        pass

    def test_order_info(self):
        """Test case for order_info

        개별 주문 조회  # noqa: E501
        """
        pass

    def test_order_info_all(self):
        """Test case for order_info_all

        주문 리스트 조회  # noqa: E501
        """
        pass

    def test_order_new(self):
        """Test case for order_new

        주문하기  # noqa: E501
        """
        pass

    def test_order_orderbook(self):
        """Test case for order_orderbook

        시세 호가 정보(Orderbook) 조회  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()