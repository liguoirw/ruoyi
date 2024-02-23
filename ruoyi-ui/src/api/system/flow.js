import request from '@/utils/request'

// 查询流量费冻结记录列表
export function listFlow(query) {
  return request({
    url: '/system/flow/list',
    method: 'get',
    params: query
  })
}

// 查询流量费冻结记录详细
export function getFlow(id) {
  return request({
    url: '/system/flow/' + id,
    method: 'get'
  })
}

// 新增流量费冻结记录
export function addFlow(data) {
  return request({
    url: '/system/flow',
    method: 'post',
    data: data
  })
}

// 修改流量费冻结记录
export function updateFlow(data) {
  return request({
    url: '/system/flow',
    method: 'put',
    data: data
  })
}

// 删除流量费冻结记录
export function delFlow(id) {
  return request({
    url: '/system/flow/' + id,
    method: 'delete'
  })
}
