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
 * SWGDepositCompleteResponse.h
 *
 * 
 */

#ifndef SWGDepositCompleteResponse_H_
#define SWGDepositCompleteResponse_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"

namespace Swagger {

class SWGDepositCompleteResponse: public SWGObject {
public:
    SWGDepositCompleteResponse();
    SWGDepositCompleteResponse(QString json);
    ~SWGDepositCompleteResponse();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGDepositCompleteResponse* fromJson(QString jsonString) override;

    QString* getCurrency();
    void setCurrency(QString* currency);

    QString* getDepositAddress();
    void setDepositAddress(QString* deposit_address);

    QString* getSecondaryAddress();
    void setSecondaryAddress(QString* secondary_address);


    virtual bool isSet() override;

private:
    QString* currency;
    bool m_currency_isSet;

    QString* deposit_address;
    bool m_deposit_address_isSet;

    QString* secondary_address;
    bool m_secondary_address_isSet;

};

}

#endif /* SWGDepositCompleteResponse_H_ */
