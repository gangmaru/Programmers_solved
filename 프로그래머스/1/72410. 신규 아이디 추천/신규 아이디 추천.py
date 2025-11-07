def solution(new_id):
    # step 1
    new_id=new_id.lower()
    # step 2
    id=''
    for ch in new_id:
        if ch.isalnum() or ch in ['-','_','.']:
            id+=ch
    # step 3
    while '..' in id:
        id=id.replace('..','.')
    # step 4
    id=id.strip('.')
    # step 5
    if len(id)==0:
        id='a'
    # step 6
    if len(id)>=16:
        id=id[:15]
        if id[-1]=='.':
            id=id[:-1]
    # step 7
    while len(id)<=2:
        id+=id[-1]
        
    return id