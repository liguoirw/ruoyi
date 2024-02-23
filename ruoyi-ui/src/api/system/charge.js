import request from '@/utils/request'

// 查询服务费冻结记录列表
export function listCharge(query) {
  return request({
    url: '/system/charge/list',
    method: 'get',
    params: query
  })
}

// 查询服务费冻结记录详细
export function getCharge(id) {
  return request({
    url: '/system/charge/' + id,
    method: 'get'
  })
}

// 新增服务费冻结记录
export function addCharge(data) {
  return request({
    url: '/system/charge',
    method: 'post',
    data: data
  })
}

// 修改服务费冻结记录
export function updateCharge(data) {
  return request({
    url: '/system/charge',
    method: 'put',
    data: data
  })
}

// 删除服务费冻结记录
export function delCharge(id) {
  return request({
    url: '/system/charge/' + id,
    method: 'delete'
  })
}
