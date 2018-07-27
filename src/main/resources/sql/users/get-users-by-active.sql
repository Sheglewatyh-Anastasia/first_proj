select user_id as user_id,
user_name as user_name,
user_birthday as user_birthday,
user_active as user_active
from cms.users where user_active = :true;

