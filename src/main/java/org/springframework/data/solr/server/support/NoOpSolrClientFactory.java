package org.springframework.data.solr.server.support;

import org.apache.solr.client.solrj.SolrClient;

public class NoOpSolrClientFactory extends SolrClientFactoryBase{
    public NoOpSolrClientFactory(SolrClient solrClient){
        super(solrClient);
    }
}
