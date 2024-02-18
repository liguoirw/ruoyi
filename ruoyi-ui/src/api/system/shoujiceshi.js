import request from '@/utils/request'

// 查询shoujiceshi列表
export function listShoujiceshi(query) {
  return request({
    url: '/system/shoujiceshi/list',
    method: 'get',
    params: query
  })
}

export function list2(query) {
  return request({
    url: '/system/shoujiceshi/list2',
    method: 'get',
    params: query
  })
}


export function list3(query) {
  return request({
    url: '/system/shoujiceshi/jiekou',
    method: 'get',
    params: query
  })
}
export function list4(query) {
  return request({
    url: '/system/shoujiceshi/jiekou1',
    method: 'get',
    params: query
  })
}

// 查询shoujiceshi详细
export function getShoujiceshi(id) {
  return request({
    url: '/system/shoujiceshi/' + id,
    method: 'get'
  })
}

// 新增shoujiceshi
export function addShoujiceshi(data) {
  return request({
    url: '/system/shoujiceshi',
    method: 'post',
    data: data
  })
}

// 修改shoujiceshi
export function updateShoujiceshi(data) {
  return request({
    url: '/system/shoujiceshi',
    method: 'put',
    data: data
  })
}

// 删除shoujiceshi
export function delShoujiceshi(id) {
  return request({
    url: '/system/shoujiceshi/' + id,
    method: 'delete'
  })
}
