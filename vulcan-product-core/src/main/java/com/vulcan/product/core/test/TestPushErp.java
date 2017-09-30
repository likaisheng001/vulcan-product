package com.vulcan.product.core.test;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.chunbo.purchase.common.util.JSONUtil;
import com.vulcan.common.client.HttpClientUtil;
import com.vulcan.product.core.model.StockReceipt;
import com.vulcan.product.core.model.StockResult;

public class TestPushErp {
	public static void main(String[] args) {
		String url = "http://stock-ws.uat.chunbo.com/services/receiveStockReceipt/receiveStockReceipt";
		
		HttpClientUtil client = HttpClientUtil.getInstance();
//		StockReceipt receipt = new StockReceipt();
		
//		String json = "{\"opReceiptId\":0,\"wareTransId\":846221,\"skuId\":1014804,\"originReceipt\":67321696,\"billId\":0,\"wareId\":7,\"inventoryType\":1,\"opType\":2401,\"originReceiptType\":24,\"owerId\":0,\"quantity\":2,\"originNum\":0,\"leftNum\":0,\"frozenFlag\":0,\"receiptType\":24,\"shelfLifeDays\":30,\"skuLot\":\"20170830\",\"originCode\":\"67321696\",\"operator\":0,\"expireDate\":\"2017-09-29 10:04:48\",\"createDate\":\"2017-08-30 10:04:48\",\"productDate\":\"2017-08-30 10:04:48\",\"fromReceipt\":0}";
//		receipt.setReceiptId(67321696);
//		receipt.setWarehouseId(7);
//		receipt.setSkuId(1014804);
//		receipt.setOperationType(2401);
//		receipt.setIsserialNumberGenerator(1);
//		receipt.setContent(json);
		
		String content = "{\"receiptId\":150322751876,\"warehouseId\":7,\"skuId\":10034749,\"bussinessType\":12,\"operationType\":1208,\"content\":\"{\\\"opReceiptId\\\":0,\\\"wareTransId\\\":846369,\\\"skuId\\\":10034749,\\\"originReceipt\\\":150322751876,\\\"billId\\\":0,\\\"wareId\\\":7,\\\"inventoryType\\\":1,\\\"opType\\\":1208,\\\"originReceiptType\\\":12,\\\"owerId\\\":0,\\\"quantity\\\":1,\\\"originNum\\\":0,\\\"leftNum\\\":0,\\\"frozenFlag\\\":0,\\\"receiptType\\\":12,\\\"shelfLifeDays\\\":500,\\\"skuLot\\\":\\\"20170901\\\",\\\"originCode\\\":\\\"67336846\\\",\\\"operator\\\":0,\\\"expireDate\\\":\\\"2019-01-14 15:32:56\\\",\\\"createDate\\\":\\\"2017-09-01 15:32:56\\\",\\\"productDate\\\":\\\"2017-09-01 15:32:56\\\",\\\"fromReceipt\\\":0}\",\"isserialNumberGenerator\":1}";
		StockReceipt receipt = JSONUtil.toObject(content, StockReceipt.class);
		
		try {
			String result = client.doPostForString(url, null, JSONUtil.toJSON(receipt));
			StockResult object = JSONUtil.toObject(result, StockResult.class);
			System.out.println(result);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test002(){
		
	}
}
