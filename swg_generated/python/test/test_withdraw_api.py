# coding: utf-8

"""
    Upbit Open API

    ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com]   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: ujhin942@gmail.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.withdraw_api import WithdrawApi  # noqa: E501
from swagger_client.rest import ApiException


class TestWithdrawApi(unittest.TestCase):
    """WithdrawApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.withdraw_api.WithdrawApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_withdraw_chance(self):
        """Test case for withdraw_chance

        출금 가능 정보  # noqa: E501
        """
        pass

    def test_withdraw_coin(self):
        """Test case for withdraw_coin

        코인 출금하기  # noqa: E501
        """
        pass

    def test_withdraw_info(self):
        """Test case for withdraw_info

        개별 출금 조회  # noqa: E501
        """
        pass

    def test_withdraw_info_all(self):
        """Test case for withdraw_info_all

        출금 리스트 조회  # noqa: E501
        """
        pass

    def test_withdraw_krw(self):
        """Test case for withdraw_krw

        원화 출금하기  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
