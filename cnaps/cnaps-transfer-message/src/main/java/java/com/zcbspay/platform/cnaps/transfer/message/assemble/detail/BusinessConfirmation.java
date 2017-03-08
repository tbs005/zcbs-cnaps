package java.com.zcbspay.platform.cnaps.transfer.message.assemble.detail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.zcbspay.platform.cnaps.transfer.message.bean.MessageBean;
import com.zcbspay.platform.cnaps.transfer.message.bean.MessageHeadBean;
import com.zcbspay.platform.cnaps.utils.TypeCast;

/**
 * 代收付业务收付款确认 - 389
 * @author lianhai
 *
 */
public class BusinessConfirmation implements AssembleBase {

	@Override
	public MessageHeadBean createMessageHead(MessageBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signatureElement(MessageBean bean) {
		List<String> msgList = new ArrayList<String>();
		
		com.zcbspay.platform.cnaps.beps.bean.BusinessConfirmation.Document document = (com.zcbspay.platform.cnaps.beps.bean.BusinessConfirmation.Document) bean
				.getCNAPSMessageBean();
		com.zcbspay.platform.cnaps.beps.bean.BusinessConfirmation.GroupHeader1 head = document.getBizConf()
				.getGrpHdr();
		com.zcbspay.platform.cnaps.beps.bean.BusinessConfirmation.OrgnlGrpHdr1 orgnlGrpHdr = document.getBizConf()
				.getOrgnlGrpHdr();
		com.zcbspay.platform.cnaps.beps.bean.BusinessConfirmation.BizConfInf1 bizConfInf = document.getBizConf()
				.getBizConfInf();

		/************ 业务头组件 ************/
		// 报文标识号
		msgList.add(head.getMsgId());
		// 报文发送时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-ddTHH:MM:SS");
		String dataString = dateFormat.format(head.getCreDtTm().toGregorianCalendar().getTime());
		msgList.add(dataString);
		// 发起直接参与机构
		msgList.add(head.getInstgPty().getInstgDrctPty());
		// 发起参与机构
		msgList.add(head.getInstgPty().getInstgPty());
		// 接收直接参与机构
		msgList.add(head.getInstdPty().getInstdDrctPty());
		// 接收参与机构
		msgList.add(head.getInstdPty().getInstdPty());
		// 系统编号
		msgList.add("BEPS");
		// 备注
		msgList.add(head.getRmk());

		/************ 原报文主键组件 ************/
		// 原报文标识号
		msgList.add(orgnlGrpHdr.getOrgnlMsgId());
		// 原发起参与机构
		msgList.add(orgnlGrpHdr.getOrgnlInstgPty());
		// 原报文类型
		msgList.add(orgnlGrpHdr.getOrgnlMT());

		// 回执状态 -- 业务状态
		msgList.add(bizConfInf.getRspnInf().getSts());
		// 回执状态 -- 业务拒绝处理码
		msgList.add(bizConfInf.getRspnInf().getRjctCd());

		// 签名要素串
		return TypeCast.listToString(msgList, "|");
	}

}
