/*
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.18
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.UpbitOpenApi);
  }
}(this, function(expect, UpbitOpenApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('BidAccount', function() {
      beforeEach(function() {
        instance = new UpbitOpenApi.BidAccount();
      });

      it('should create an instance of BidAccount', function() {
        // TODO: update the code to test BidAccount
        expect(instance).to.be.a(UpbitOpenApi.BidAccount);
      });

      it('should have the property currency (base name: "currency")', function() {
        // TODO: update the code to test the property currency
        expect(instance).to.have.property('currency');
        // expect(instance.currency).to.be(expectedValueLiteral);
      });

      it('should have the property balance (base name: "balance")', function() {
        // TODO: update the code to test the property balance
        expect(instance).to.have.property('balance');
        // expect(instance.balance).to.be(expectedValueLiteral);
      });

      it('should have the property locked (base name: "locked")', function() {
        // TODO: update the code to test the property locked
        expect(instance).to.have.property('locked');
        // expect(instance.locked).to.be(expectedValueLiteral);
      });

      it('should have the property avgBuyPrice (base name: "avg_buy_price")', function() {
        // TODO: update the code to test the property avgBuyPrice
        expect(instance).to.have.property('avgBuyPrice');
        // expect(instance.avgBuyPrice).to.be(expectedValueLiteral);
      });

      it('should have the property avgBuyPriceModified (base name: "avg_buy_price_modified")', function() {
        // TODO: update the code to test the property avgBuyPriceModified
        expect(instance).to.have.property('avgBuyPriceModified');
        // expect(instance.avgBuyPriceModified).to.be(expectedValueLiteral);
      });

      it('should have the property unitCurrency (base name: "unit_currency")', function() {
        // TODO: update the code to test the property unitCurrency
        expect(instance).to.have.property('unitCurrency');
        // expect(instance.unitCurrency).to.be(expectedValueLiteral);
      });

    });
  });

}));
