/**
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

/*
 * SWGOrderChance.h
 *
 * 
 */

#ifndef SWGOrderChance_H_
#define SWGOrderChance_H_

#include <QJsonObject>


#include "SWGAskAccount.h"
#include "SWGBidAccount.h"
#include "SWGMarket.h"
#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGOrderChance: public SWGObject {
public:
    SWGOrderChance();
    SWGOrderChance(QString json);
    ~SWGOrderChance();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGOrderChance* fromJson(QString jsonString) override;

    QString* getBidFee();
    void setBidFee(QString* bid_fee);

    QString* getAskFee();
    void setAskFee(QString* ask_fee);

    SWGMarket* getMarket();
    void setMarket(SWGMarket* market);

    SWGBidAccount* getBidAccount();
    void setBidAccount(SWGBidAccount* bid_account);

    SWGAskAccount* getAskAccount();
    void setAskAccount(SWGAskAccount* ask_account);


    virtual bool isSet() override;

private:
    QString* bid_fee;
    bool m_bid_fee_isSet;

    QString* ask_fee;
    bool m_ask_fee_isSet;

    SWGMarket* market;
    bool m_market_isSet;

    SWGBidAccount* bid_account;
    bool m_bid_account_isSet;

    SWGAskAccount* ask_account;
    bool m_ask_account_isSet;

};

}

#endif /* SWGOrderChance_H_ */
