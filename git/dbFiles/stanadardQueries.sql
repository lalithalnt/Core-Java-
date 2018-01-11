--1.Deal Details:

select * from CQ_DEAL

where opty_number='62008365' -- deal_id

--2.Quoting LOVs:

select * from CQ_LOV where lov_type='DEAL_TYPE'

--Deal and Quote details:

select * from cq_deal d, cq_quote q

where d.object_id=q.deal_object_id

and opty_number='62008365'

--
select * from cq_ccw_all_deal

--Quote Line Details:

select * from cq_quote_line where quote_object_id=4713327609 and active=1



 