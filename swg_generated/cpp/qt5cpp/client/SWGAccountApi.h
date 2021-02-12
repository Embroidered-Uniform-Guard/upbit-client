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

#ifndef _SWG_SWGAccountApi_H_
#define _SWG_SWGAccountApi_H_

#include "SWGHttpRequest.h"

#include "SWGAccount.h"
#include "SWGError.h"
#include "SWGWallet.h"

#include <QObject>

namespace Swagger {

class SWGAccountApi: public QObject {
    Q_OBJECT

public:
    SWGAccountApi();
    SWGAccountApi(QString host, QString basePath);
    ~SWGAccountApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void account_info();
    void account_wallet();
    
private:
    void account_infoCallback (SWGHttpRequestWorker * worker);
    void account_walletCallback (SWGHttpRequestWorker * worker);
    
signals:
    void account_infoSignal(QList<SWGAccount*>* summary);
    void account_walletSignal(QList<SWGWallet*>* summary);
    
    void account_infoSignalE(QList<SWGAccount*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void account_walletSignalE(QList<SWGWallet*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void account_infoSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void account_walletSignalEFull(SWGHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
