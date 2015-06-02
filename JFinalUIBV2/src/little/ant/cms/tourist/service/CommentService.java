package little.ant.cms.tourist.service;

import little.ant.platform.annotation.MyTxProxy;
import little.ant.platform.service.BaseService;

import org.apache.log4j.Logger;

public class CommentService extends BaseService {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(CommentService.class);
	
	public static final CommentService service = MyTxProxy.newProxy(CommentService.class);
	
}
