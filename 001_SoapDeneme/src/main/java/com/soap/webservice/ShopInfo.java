package com.soap.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author H�seyin
 */
@WebService(name = "dukkan_bilgisi", portName = "001", serviceName = "shopInfo")
@SOAPBinding(style = SOAPBinding.Style.RPC)
// @SOAPBinding(style = Style.RPC)
public class ShopInfo {
	@WebMethod
	@WebResult(partName = "buraCikis")
	public String getShopInfo(@WebParam(partName = "buraGiris") String property) throws InvalidInputException {
		String response = null;
		if ("shopName".equals(property)) {
			response = "H�seyin d�kkan";
		} else if ("since".equals(property)) {
			response = "Since 1994";
		} else {
			throw new InvalidInputException("Ge�ersiz giri�", property + " bu �zellik bo� ge�ilemez!");
		}
		return response;
	}

	@WebMethod
	@WebResult(partName = "buraCikiss")
	public String getAbc(@WebParam(partName = "buraGiriss") String property) throws InvalidInputException {
		String response = null;
		if ("shopName".equals(property)) {
			response = "H�seyin d�kkan";
		} else if ("since".equals(property)) {
			response = "Since 1994";
		} else {
			throw new InvalidInputException("Ge�ersiz giri�", property + " bu �zellik bo� ge�ilemez!");
		}
		return response;
	}
}
