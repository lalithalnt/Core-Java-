select * from CQ_DEAL 

select * from CQ_DEAL where opty_number='103105844' 
--opty number is "deal id in ccw"

select * from cq_lov where lov_type='DEAL_TYPE'


select * from cq_lov where lov_type='DEAL_SOURCE'

select * from CQ_QUOTE where site_object_id='4923345436'

select * from CQ_DEAL where opty_number='62007430' 

select * from cq_lov where lov_type='PDR_DEAL_STATUS'

select * from cq_lov where lov_type like '%LINE%'


--%LINE% means it will check all data with that word

select * from cq_lov where lov_type='BOM_LINE_TYPE' order by LOV_INDEX

Deal Type 1 -> AM created standard deal/opportunity
Deal Type 2 -> AM created NS deal/opportunity
Deal Type 3 -> partner/disti/Re-seller created standard deal
Deal Type 5 ->partner/disti/Re-seller created NS deal

select * from CQ_QUOTE where object_id='4713320971'

select * from CQ_QUOTE_LINE where quote_object_id='4713320971'
and active=1

select * from CQ_QUOTE_LINE_EXTN where QUOTE_LINE_OBJECT_ID in (select object_id from CQ_QUOTE_LINE where quote_object_id='4713320971'
and active=1)

select * from cq_team_assignment where deal_object_id='4708960011'


select * from CQ_AUDIT_HISTORY where deal_object_id='4713321983'


select * from cq_deal where opty_number='18304872'

select * from cq_deal where opty_number='23032712'

select * from cq_deal d,cq_quote q
where d.object_id=q.deal_object_id
and opty_number='18304872'





